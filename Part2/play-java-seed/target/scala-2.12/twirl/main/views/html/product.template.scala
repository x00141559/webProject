
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

object product extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Product")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
			"""),format.raw/*4.22*/("""
			"""),format.raw/*5.4*/("""<div class="container-fluid">
					<!---Start Rachel -->
					<div class="product-container">
							<h2>Product</h2>
							<div class="product-img">
									image goes here
							</div>
							<div class="product-description">
									Lorem ipsum dolor sit amet, duo eu appareat vulputate, ut vis agam platonem. 
									Summo ludus maiorum sed et, usu habeo offendit disputando ea. Altera adipiscing sea in, natum tibique an qui. Pri amet officiis antiopam id, id his clita tamquam iracundia. Sensibus platonem scribentur vel ea. Ex duo appareat intellegat.
									Persius nominavi pertinax ad pri. Ei latine accusata cum. Oratio decore reprimique ut per, possim copiosae te nec. Inermis nominati has no.
									Postea sapientem eam eu. Ridens definiebas an quo, porro aliquam verterem eum id, ferri saperet qui ad. Ad justo summo mundi duo. Facer melius appareat cu est, est ad idque nusquam corpora. Vel in mundi errem scribentur, vix scripta saperet no.
							</div>
							<div class="addtocart">
									&euro;0.00 &nbsp;
									<button type="submit" class="btn btn-success">Add to Cart</button>
							</div>
			</div>
			"""),format.raw/*23.20*/("""
""")))}),format.raw/*24.2*/("""
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
                  SOURCE: /media/sf_student/CA3/Part2/play-java-seed/app/views/product.scala.html
                  HASH: 3a1c284addac40c9c6d78de2ca9e367a9e69d485
                  MATRIX: 943->1|1039->3|1069->8|1092->23|1131->25|1163->48|1194->53|2383->1230|2416->1233
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|55->23|56->24
                  -- GENERATED --
              */
          