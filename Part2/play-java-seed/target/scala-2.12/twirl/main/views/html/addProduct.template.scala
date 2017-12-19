
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Product", user)/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
    """),format.raw/*5.5*/("""<div class="container fluid">
        <h2>Add a new product</h2>
        """),_display_(/*7.10*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*7.109*/ {_display_(Seq[Any](format.raw/*7.111*/("""
            """),_display_(/*8.14*/CSRF/*8.18*/.formField),format.raw/*8.28*/("""

            """),_display_(/*10.14*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.89*/("""
            """),_display_(/*11.14*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*11.91*/("""
            """),_display_(/*12.14*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*12.91*/("""

            """),_display_(/*14.14*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*14.78*/("""

            """),format.raw/*16.13*/("""<div class="actions">
                <input type="submit" value="Add/Update Product" class="btn btn-primary">
                <a href=""""),_display_(/*18.27*/routes/*18.33*/.HomeController.products()),format.raw/*18.59*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
        """)))}),format.raw/*22.10*/("""
    """),format.raw/*23.5*/("""</div>
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 18 23:58:31 GMT 2017
                  SOURCE: C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/app/views/addProduct.scala.html
                  HASH: f6a8ac23085dc375dc848717f5420ad2ff11c5a1
                  MATRIX: 985->1|1118->64|1163->61|1191->81|1219->84|1252->109|1291->111|1323->117|1425->193|1533->292|1573->294|1614->309|1626->313|1656->323|1700->340|1796->415|1838->430|1936->507|1978->522|2076->599|2120->616|2205->680|2249->696|2415->835|2430->841|2477->867|2646->1005|2679->1011
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|39->7|39->7|40->8|40->8|40->8|42->10|42->10|43->11|43->11|44->12|44->12|46->14|46->14|48->16|50->18|50->18|50->18|54->22|55->23
                  -- GENERATED --
              */
          