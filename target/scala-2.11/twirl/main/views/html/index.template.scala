
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Cat Database")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

"""),format.raw/*5.1*/("""<table>
    <tr>
        <td><h2>Cat List</h2></td>
    </tr>
    <tr>
        <td><select id="catListView" size="20" style="width:150px;" onclick="getSelectedCat();"></select></td>
        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
        <td>
            <form method="post" action=""""),_display_(/*13.42*/routes/*13.48*/.Application.add_update_del_Cat()),format.raw/*13.81*/("""">
                <table>
                    <tr>
                        <td><h3>Cat Details</h3></td>
                    </tr>
                    <tr>
                        <td>Id:</td>
                        <td><input id="catid" name="catid" type="text" readonly></td>
                    </tr>
                    <tr>
                        <td>Name:</td>
                        <td><input id="name" name="name" type="text"></td>
                    </tr>
                    <tr>
                        <td>Color:</td>
                        <td><input id="color" name="color" type="text"></td>
                    </tr>
                    <tr>
                        <td>Race:</td>
                        <td><input id="race" name="race" type="text"></td>
                    </tr>
                    <tr>
                        <td>Picture File:</td>
                        <td><input id="pic" name="pic" type="text" readonly></td>
                    </tr>
                    <tr>
                        <td>Gender:</td>
                        <td><select id="gender" name="gender" style="width:140px;">
                            <option value="m">Male</option>
                            <option value="f">Female</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td>
                            <button name="submitBtn" value="addCatBtn" onclick="emptyIdField();" style="width:105px;">
                                Add Cat
                            </button>
                        </td>

                        <td>
                            <button name="submitBtn" value="updateCatBtn" style="width:105px;">Update Cat</button>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <button name="submitBtn" value="deleteCatBtn" style="width:105px;">Delete Cat</button>
                        </td>

                        <td>
                            <button name="submitBtn" value="emptyfiledsBtn" onclick="emptyFormFields()" style="width:105px;">Empty Fields</button>
                        </td>
                    </tr>
                </table>
            </form>
        </td>
        <td>
            <table>
                <tr>
                    <td><img id="picImg" name="picImg" src="" width="310" height="200" /></td>
                </tr>
                <tr>
                    <td>
                        <iframe id="uploadImg" name="uploadImg" width="0" height="0" frameborder="0" scrolling="yes" onload="populateForm();"></iframe>
                        <form enctype="multipart/form-data" method="post" action=""""),_display_(/*76.84*/routes/*76.90*/.Application.upload()),format.raw/*76.111*/("""" target="uploadImg">
                            <input type="file" name="picture">
                            <input type="submit" value="Upload">
                        </form>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</table>


<script src='"""),_display_(/*88.15*/routes/*88.21*/.Assets.versioned("js/func.js")),format.raw/*88.52*/("""' type="text/javascript"></script>

""")))}),format.raw/*90.2*/("""

"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Jul 21 01:28:53 EEST 2015
                  SOURCE: C:/Users/Pazhman/Documents/Projects/Play2/cat_db/app/views/index.scala.html
                  HASH: 9ad4f3c2d7c2eacff8f26a0326a2dd76953aec6d
                  MATRIX: 527->1|639->18|667->21|695->41|734->43|762->45|1133->389|1148->395|1202->428|3975->3174|3990->3180|4033->3201|4360->3501|4375->3507|4427->3538|4494->3575
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|37->13|37->13|37->13|100->76|100->76|100->76|112->88|112->88|112->88|114->90
                  -- GENERATED --
              */
          