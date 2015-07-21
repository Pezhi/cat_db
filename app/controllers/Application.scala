package controllers

import java.io.File
import models.{DB, Cat}
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc._
import scala.swing.Dialog.Options
import scala.swing.Dialog


class Application extends Controller {

  var catFormObj = new Cat("", "", "", "", "", "")

  def index = Action {

    Ok(views.html.index("Your new application is ready."))
  }

  val catForm: Form[Cat] = Form {
    mapping(
      "catid" -> text,
      "name" -> text,
      "color" -> text,
      "pic" -> text,
      "race" -> text,
      "gender" -> text
    )(Cat.apply)(Cat.unapply)
  }

  def add_update_del_Cat = Action { implicit request =>

    val cat = catForm.bindFromRequest.get

    request.body.asFormUrlEncoded.get("submitBtn").headOption match {
      case Some("deleteCatBtn") => {
        delCat(cat)
        catFormObj = new Cat("", "", "", "", "", "")
      }
      case Some("addCatBtn") => {
        addCat(cat)
        catFormObj = new Cat("", "", "", "", "", "")
      }
      case Some("updateCatBtn") => {
        updateCat(cat)
        catFormObj = new Cat("", "", "", "", "", "")
      }
      case Some("emptyfiledsBtn") => {
        catFormObj = new Cat("", "", "", "", "", "")
      }
      case _ => println("Invalid action.  ")
    }
    Redirect(routes.Application.index())
  }

  def updateCat(cat: Cat) = {
    if (cat.catid.isEmpty) {
      Dialog.showMessage(null, "Please select a cat from the first!", "Error", Dialog.Message.Error)
    } else {
      val catVal = DB.query[Cat].whereEqual("id", cat.catid.toLong).fetchOne()
      if (catVal.isEmpty) {
        Dialog.showMessage(null, "No record found in the database by selected cat id.", "Error", Dialog.Message.Error)
      } else {
        DB.query[Cat].whereEqual("id", cat.catid.toLong).fetchOne()
          .map(a => a.copy(catid = String.valueOf(a.id)))
          .map(a => a.copy(name = cat.name))
          .map(a => a.copy(color = cat.color))
          .map(a => a.copy(pic = cat.pic))
          .map(a => a.copy(race = cat.race))
          .map(a => a.copy(gender = cat.gender))
          .map(DB.save)
      }
    }
  }

  def addCat(cat: Cat) = {
    val cats = DB.query[Cat]
      .whereEqual("name", cat.name)
      .whereEqual("color", cat.color)
      .whereEqual("pic", cat.pic)
      .whereEqual("race", cat.race)
      .whereEqual("gender", cat.gender)
      .fetch()

    if (cat.name.trim.length < 1) {
      Dialog.showMessage(null, "Please enter a cat name!", "Error", Dialog.Message.Error)
    }
    else if (!cats.isEmpty && cats.length > 0) {
      Dialog.showMessage(null, "A record with exactly same details already exists in database!", "Error", Dialog.Message.Error)
    }
    else {
      DB.save(cat)
    }
  }

  def delCat(cat: Cat) = {
    if (cat.catid.isEmpty) {
      Dialog.showMessage(null, "Please select a cat from the first!", "Error", Dialog.Message.Error)
    } else {
      val catVal = DB.query[Cat].whereEqual("id", cat.catid.toLong).fetchOne()
      if (catVal.isEmpty) {
        Dialog.showMessage(null, "No record found in the database by selected cat id.", "Error", Dialog.Message.Error)
      } else {
        val result = Dialog.showConfirmation(null, "Are you sure you want to delete this cat?", "Confirmation", Options.YesNo, Dialog.Message.Question)
        if (result == Dialog.Result.Yes) {
          DB.delete(catVal.last)
        }
      }
    }
  }

  def getCats = Action {

    var found = false
    var cats = DB.query[Cat].fetch
    for (c <- cats) {
      if (c.catid.isEmpty) {
        DB.query[Cat]
          .whereEqual("name", c.name)
          .whereEqual("color", c.color)
          .whereEqual("pic", c.pic)
          .whereEqual("race", c.race)
          .whereEqual("gender", c.gender)
          .fetchOne().map(a => a.copy(catid = String.valueOf(a.id))).map(DB.save)

        found = true
      }
    }

    if (found) {
      cats = DB.query[Cat].fetch
    }
    Ok(Json.toJson(cats))
  }

  def upload = Action(parse.multipartFormData) { request =>
    request.body.file("picture").map { picture =>
      val ext = utils.Util.getFileExt(picture.filename)
      val uuid = java.util.UUID.randomUUID.toString
      val contentType = picture.contentType

      var filename = "/tmp/" + uuid + "." + ext

      picture.ref.moveTo(new File(filename))

      filename = "/images/" + uuid + "." + ext

      catFormObj = catFormObj.copy(catFormObj.catid, catFormObj.name, catFormObj.color, filename, catFormObj.race, catFormObj.gender);

      Redirect(routes.Application.index).flashing("success" -> "Picture uploaded")
    }.getOrElse {
      Redirect(routes.Application.index).flashing(
        "error" -> "Missing file"
      )
    }
  }

  def catFormInit = Action {
    Ok(Json.toJson(catFormObj))
  }

  def images (name: String) = Action {

    Ok.sendFile(
      //content = new java.io.File("images/" + name)
      content = new java.io.File("/tmp/" + name)
        ,inline = true
    )
  }





}

