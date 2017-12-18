
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

object purchase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(purchase: String, user: models.users.User)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),_display_(/*3.2*/main("Purchase",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
			"""),format.raw/*4.22*/("""
			"""),format.raw/*5.4*/("""<div class="container-fluid">
					<h2>Purchase</h2>
					<p> Here is a summary of your order</p>
					<p>To continue with the purchase please enter your details in the form below</p>
			 <form>
					<div class="form-group">
						<label for="name">Name:</label>
						<input type="name" class="form-control" id="name">
					</div>
					<div class="form-group">
						<label for="cardno">Card Number:</label>
						<input type="cardno" class="form-control" id="cardno">
					</div>
					<div class="form-group">
						<label for="ccn">CCN Number:</label>
						<input type="password" class="form-control" id="ccn">
					</div>
					<div class="form-group">
						<label for="email">Email:</label>
						<input type="email" class="form-control" id="email">
					</div>
					<button type="submit" class="btn btn-success">Submit</button>
				</form>
				</div>
			"""),format.raw/*29.20*/("""
""")))}),format.raw/*30.2*/("""
"""))
      }
    }
  }

  def render(purchase:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(purchase,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (purchase,user) => (content) => apply(purchase,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 18 15:54:01 GMT 2017
                  SOURCE: /home/wdd/webapps/webProject/Part2/play-java-seed/app/views/purchase.scala.html
                  HASH: f69059f1ceef4dd2f83c50e65e6ee13248033ae2
                  MATRIX: 974->1|1126->58|1154->61|1183->82|1222->84|1253->106|1283->110|2172->987|2204->989
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|61->29|62->30
                  -- GENERATED --
              */
          