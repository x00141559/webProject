
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
    """),format.raw/*5.5*/("""<div class="container fluid col-md-12">
        <h2>Add a new product</h2>
        """),_display_(/*7.10*/helper/*7.16*/.form(action = controllers.routes.HomeController.addProductSubmit())/*7.84*/ {_display_(Seq[Any](format.raw/*7.86*/("""
            """),_display_(/*8.14*/CSRF/*8.18*/.formField),format.raw/*8.28*/("""
            """),format.raw/*9.13*/("""<div class="form-group">
                """),_display_(/*10.18*/inputText(productForm("name"), '_label -> "Name",
                'class -> "form-control")),format.raw/*11.42*/("""
            """),format.raw/*12.13*/("""</div>
            <div class="form-group">
                """),_display_(/*14.18*/inputText(productForm("description"), '_label -> "Description",
                'class -> "form-control")),format.raw/*15.42*/("""
            """),format.raw/*16.13*/("""</div>
            <div class="form-group">
                """),_display_(/*18.18*/inputText(productForm("stock"), '_label -> "Stock",
                'class -> "form-control")),format.raw/*19.42*/("""
            """),format.raw/*20.13*/("""</div>
            <div class="form-group">
                """),_display_(/*22.18*/inputText(productForm("price"), '_label -> "Price",
                'class -> "form-control")),format.raw/*23.42*/("""
            """),format.raw/*24.13*/("""</div>
            """),_display_(/*25.14*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*25.78*/("""
            """),format.raw/*26.13*/("""<div class="form-group">
                <input type="submit" value="Add/Update Product" class="btn btn-primary">
                <a href=""""),_display_(/*28.27*/routes/*28.33*/.HomeController.products()),format.raw/*28.59*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
        """)))}),format.raw/*32.10*/("""
""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 18:13:21 GMT 2017
                  SOURCE: C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/app/views/addProduct.scala.html
                  HASH: 8da0e34a7dab800ef60ad6e1bd478dc5ca5430d7
                  MATRIX: 985->1|1118->64|1163->61|1191->81|1219->84|1252->109|1291->111|1323->117|1435->203|1449->209|1525->277|1564->279|1605->294|1617->298|1647->308|1688->322|1758->365|1871->457|1913->471|2003->534|2130->640|2172->654|2262->717|2377->811|2419->825|2509->888|2624->982|2666->996|2714->1017|2799->1081|2841->1095|3010->1237|3025->1243|3072->1269|3241->1407|3274->1410
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|42->10|43->11|44->12|46->14|47->15|48->16|50->18|51->19|52->20|54->22|55->23|56->24|57->25|57->25|58->26|60->28|60->28|60->28|64->32|65->33
                  -- GENERATED --
              */
          