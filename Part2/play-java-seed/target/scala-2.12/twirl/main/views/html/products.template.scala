
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main("Products")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
			"""),format.raw/*4.22*/("""
			"""),format.raw/*5.4*/("""<h1 class="product-header">Our Products</h1>
				"""),_display_(/*6.6*/for(p <- products) yield /*6.24*/{_display_(Seq[Any](format.raw/*6.25*/("""
 				"""),format.raw/*7.6*/("""<div class="panel-group container-fluid">
					<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" href="#collapse"""),_display_(/*11.50*/p/*11.51*/.getId),format.raw/*11.57*/("""">"""),_display_(/*11.60*/p/*11.61*/.getName),format.raw/*11.69*/("""</a>
						</h4>
					</div>
					<div id="collapse"""),_display_(/*14.24*/p/*14.25*/.getId),format.raw/*14.31*/("""" class="panel-collapse collapse">
						<div class="panel-body">
							"""),_display_(/*16.9*/p/*16.10*/.getDescription),format.raw/*16.25*/("""
						"""),format.raw/*17.7*/("""</div>
						<div class="panel-footer">&euro; """),_display_(/*18.41*/("%.2f".format(p.getPrice))),format.raw/*18.68*/(""" """),format.raw/*18.69*/("""&nbsp;
							<button class="btn btn-success" type="submit">Buy Now</button>
						</div>
					</div>
					</div>
				</div>
			</br>
		""")))}),format.raw/*25.4*/("""
        	"""),format.raw/*26.10*/("""</div>
			"""),format.raw/*27.20*/("""
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 15:54:08 GMT 2017
                  SOURCE: C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/app/views/products.scala.html
                  HASH: 9a5d2f55e7bf97cb7c2abe12121b95b5361a68ef
                  MATRIX: 965->1|1092->33|1122->38|1146->54|1185->56|1217->79|1248->84|1324->135|1357->153|1395->154|1428->161|1653->359|1663->360|1690->366|1720->369|1730->370|1759->378|1841->433|1851->434|1878->440|1980->516|1990->517|2026->532|2061->540|2136->588|2184->615|2213->616|2387->760|2426->771|2465->798|2498->801
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|38->6|38->6|38->6|39->7|43->11|43->11|43->11|43->11|43->11|43->11|46->14|46->14|46->14|48->16|48->16|48->16|49->17|50->18|50->18|50->18|57->25|58->26|59->27|60->28
                  -- GENERATED --
              */
          