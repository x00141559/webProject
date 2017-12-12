
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

object purchase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Purchase")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
			"""),format.raw/*4.22*/("""
			"""),format.raw/*5.4*/("""<div class="container-fluid">
					<h2>Purchase</h2>
					<p> Here is a summary of your order</p>
					<p> image goes  here</p>
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
			"""),format.raw/*30.20*/("""
""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 12 16:32:02 GMT 2017
                  SOURCE: /media/sf_student/CA3/Part2/play-java-seed/app/views/purchase.scala.html
                  HASH: 6977593e6aafe961200ae3cdf933bb8af6537c11
                  MATRIX: 944->1|1040->3|1070->8|1094->24|1133->26|1165->49|1196->54|2140->986|2173->989
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|62->30|63->31
                  -- GENERATED --
              */
          