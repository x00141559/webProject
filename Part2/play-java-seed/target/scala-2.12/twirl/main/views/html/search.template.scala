
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

object search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(query: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),_display_(/*3.2*/main("Search")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
			"""),format.raw/*4.22*/("""
			"""),format.raw/*5.4*/("""<h1 class="product-header">X Results for """),_display_(/*5.46*/query),format.raw/*5.51*/("""</h1>
			"""),_display_(/*6.5*/for(i <- 1 to 10) yield /*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
				"""),format.raw/*7.5*/("""<div class="panel-group container-fluid">
						<div class="panel panel-default">
								<div class="panel-heading">
								<h4 class="panel-title">
										<a data-toggle="collapse" href="#collapse"""),_display_(/*11.53*/i),format.raw/*11.54*/("""">Example Search Result</a>
								</h4>
						</div>
						<div id="collapse"""),_display_(/*14.25*/i),format.raw/*14.26*/("""" class="panel-collapse collapse">
								<div class="panel-body">
										Example Product Description/Images
								</div>
								<div class="panel-footer">&euro;0.00 &nbsp;
										<button class="btn btn-success" type="submit">Add to Cart</button>
								</div>
						</div>
						</div>
					</div>
				</br>
			""")))}),format.raw/*25.5*/("""
			"""),format.raw/*26.20*/("""
""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(query:String): play.twirl.api.HtmlFormat.Appendable = apply(query)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (query) => apply(query)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 12 16:32:02 GMT 2017
                  SOURCE: /media/sf_student/CA3/Part2/play-java-seed/app/views/search.scala.html
                  HASH: f495a9e1a76f7b0a730e73051b6c2cefb4c69b38
                  MATRIX: 949->1|1059->16|1089->21|1111->35|1150->37|1182->60|1213->65|1281->107|1306->112|1342->123|1374->140|1413->142|1445->148|1679->355|1701->356|1810->438|1832->439|2197->774|2230->795|2263->798
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|43->11|43->11|46->14|46->14|57->25|58->26|59->27
                  -- GENERATED --
              */
          