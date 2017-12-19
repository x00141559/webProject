
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

object purchase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.Product,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(p: models.Product, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

"""),_display_(/*3.2*/main("Purchase",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
		"""),format.raw/*4.21*/("""
		"""),format.raw/*5.3*/("""<div class="container-fluid">
				<h2>Purchase</h2>
				<p> Here is a summary of your order</p>
				"""),_display_(/*8.6*/if(p != null)/*8.19*/ {_display_(Seq[Any](format.raw/*8.21*/("""
					"""),format.raw/*9.6*/("""<div class="container-fluid">
						<!---Start Rachel -->
						<div class="product-container">
							<h4>"""),_display_(/*12.13*/p/*12.14*/.getName),format.raw/*12.22*/(""",&nbsp;&nbsp;&nbsp;&euro;"""),_display_(/*12.48*/("%.2f".format(p.getPrice))),format.raw/*12.75*/("""</h4>
						</div>
				</div>
					<form>
						<div class="form-group col-md-12">
							<label for="name">Name:</label>
							<input type="name" class="form-control" id="name">
						</div>
						<div class="form-group col-md-8">
							<label for="cardno">Card Number:</label>
							<input type="cardno" class="form-control" id="cardno">
						</div>
						<div class="form-group col-md-4">
							<label for="ccn">CCN Number:</label>
							<input type="password" class="form-control" id="ccn">
						</div>
						&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" onclick="purchase()" class="btn btn-success">Purchase</a>
						<div class="container-fluid hidden">
							<h2>Thank you for your purchase!</h2>
						</div>
					</form>
				""")))}/*33.7*/else/*33.12*/{_display_(Seq[Any](format.raw/*33.13*/("""
					"""),format.raw/*34.6*/("""<h2>Product Not Found</h2>
				""")))}),format.raw/*35.6*/("""
		"""),format.raw/*36.3*/("""</div>
	"""),format.raw/*37.18*/("""
""")))}),format.raw/*38.2*/("""
"""))
      }
    }
  }

  def render(p:models.Product,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(p,user)

  def f:((models.Product,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (p,user) => apply(p,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 18:48:09 GMT 2017
                  SOURCE: C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/app/views/purchase.scala.html
                  HASH: 1eb7e428138258a99a2fcd01de8540c47cc9321d
                  MATRIX: 977->1|1116->45|1146->50|1175->71|1214->73|1245->95|1275->99|1404->203|1425->216|1464->218|1497->225|1635->336|1645->337|1674->345|1727->371|1775->398|2547->1153|2560->1158|2599->1159|2633->1166|2696->1199|2727->1203|2764->1228|2797->1231
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|40->8|40->8|40->8|41->9|44->12|44->12|44->12|44->12|44->12|65->33|65->33|65->33|66->34|67->35|68->36|69->37|70->38
                  -- GENERATED --
              */
          