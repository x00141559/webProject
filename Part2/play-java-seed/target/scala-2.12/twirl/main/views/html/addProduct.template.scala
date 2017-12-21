
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
        """),_display_(/*7.10*/form(action=routes.HomeController.addProductSubmit(),'class -> "form horizontal", 'role -> "form")/*7.108*/{_display_(Seq[Any](format.raw/*7.109*/("""
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
                <a href=""""),_display_(/*28.27*/routes/*28.33*/.HomeController.index(0)),format.raw/*28.57*/("""">
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
                  DATE: Thu Dec 21 14:13:40 GMT 2017
                  SOURCE: /home/wdd/webapps/webProject/Part2/play-java-seed/app/views/addProduct.scala.html
                  HASH: 1b7a903916cb00ce88344ef29141a1d88d5a8f79
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1250->106|1289->108|1320->113|1430->197|1537->295|1576->296|1616->310|1628->314|1658->324|1698->337|1767->379|1879->470|1920->483|2008->544|2134->649|2175->662|2263->723|2377->816|2418->829|2506->890|2620->983|2661->996|2708->1016|2793->1080|2834->1093|3001->1233|3016->1239|3061->1263|3226->1397|3258->1399
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|39->7|39->7|40->8|40->8|40->8|41->9|42->10|43->11|44->12|46->14|47->15|48->16|50->18|51->19|52->20|54->22|55->23|56->24|57->25|57->25|58->26|60->28|60->28|60->28|64->32|65->33
                  -- GENERATED --
              */
          