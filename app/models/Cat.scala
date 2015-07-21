package models


import play.api.libs.json.Json

/**
 * Created by Pazhman
 */

case class Cat (catid: String, name: String, color: String, pic: String, race: String, gender: String)

object Cat {

  implicit val catFormat = Json.format[Cat]


}

