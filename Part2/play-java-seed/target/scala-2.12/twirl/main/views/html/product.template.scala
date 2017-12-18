
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

object product extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: String, user: models.users.User)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),_display_(/*3.2*/main("Product",user)/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
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

  def render(product:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(product,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (product,user) => (content) => apply(product,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 18 15:54:01 GMT 2017
                  SOURCE: /home/wdd/webapps/webProject/Part2/play-java-seed/app/views/product.scala.html
                  HASH: 5ec848a2972633ce81ed677ee7eb6099a1149d1d
                  MATRIX: 973->1|1124->57|1152->60|1180->80|1219->82|1250->104|1280->108|2451->1267|2483->1269
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|55->23|56->24
                  -- GENERATED --
              */
          