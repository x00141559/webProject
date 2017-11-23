
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Basket")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
			"""),format.raw/*4.22*/("""
			"""),format.raw/*5.4*/("""<h1 class="product-header">Your Basket</h1>
			"""),_display_(/*6.5*/for(i <- 1 to 10) yield /*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
				"""),format.raw/*7.5*/("""<div class="panel-group container-fluid">
						<div class="panel panel-default">
								<div class="panel-heading">
								<h4 class="panel-title">
										<a data-toggle="collapse" href="#collapse"""),_display_(/*11.53*/i),format.raw/*11.54*/("""">Example Basket Item</a>
								</h4>
						</div>
						<div id="collapse"""),_display_(/*14.25*/i),format.raw/*14.26*/("""" class="panel-collapse collapse">
								<div class="panel-body">
										Example Product Description/Images
								</div>
								<div class="panel-footer">&euro;0.00 &nbsp;
								</div>
						</div>
						</div>
					</div>
				</br>
			""")))}),format.raw/*24.5*/("""
			"""),format.raw/*25.4*/("""<p class="container-fluid">Total &euro;0.00</p>
			"""),format.raw/*26.20*/("""
""")))}),format.raw/*27.2*/("""
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
                  DATE: Fri Nov 17 18:08:38 GMT 2017
                  SOURCE: E:/College/Web/play-java-seed/app/views/basket.scala.html
                  HASH: 85f76245df382c99e1f0866b7926a98482d943f6
                  MATRIX: 942->1|1038->3|1066->6|1088->20|1127->22|1158->44|1188->48|1261->96|1293->113|1332->115|1363->120|1593->323|1615->324|1719->401|1741->402|2018->649|2049->653|2128->720|2160->722
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|38->6|38->6|38->6|39->7|43->11|43->11|46->14|46->14|56->24|57->25|58->26|59->27
                  -- GENERATED --
              */
          