
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
    """),format.raw/*5.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*6.105*/ {_display_(Seq[Any](format.raw/*6.107*/("""
        """),format.raw/*7.37*/("""
        """),_display_(/*8.10*/CSRF/*8.14*/.formField),format.raw/*8.24*/("""

        """),_display_(/*10.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*10.99*/("""
        """),_display_(/*11.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*11.87*/("""
        """),_display_(/*12.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*12.87*/("""

        """),_display_(/*14.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*14.74*/("""

        """),format.raw/*16.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Product" class="btn btn-primary">
            <a href=""""),_display_(/*18.23*/routes/*18.29*/.HomeController.index(0)),format.raw/*18.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*22.6*/("""
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
                  DATE: Mon Dec 18 15:54:01 GMT 2017
                  SOURCE: /home/wdd/webapps/webProject/Part2/play-java-seed/app/views/addProduct.scala.html
                  HASH: 570ce98013eaeb3255864cf9d8a8ddafb98164c9
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1250->106|1289->108|1320->113|1388->156|1496->255|1536->257|1572->294|1608->304|1620->308|1650->318|1688->329|1798->418|1835->428|1933->505|1970->515|2068->592|2106->603|2191->667|2228->677|2384->806|2399->812|2444->836|2592->954
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|40->8|40->8|40->8|42->10|42->10|43->11|43->11|44->12|44->12|46->14|46->14|48->16|50->18|50->18|50->18|54->22
                  -- GENERATED --
              */
          