
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

object search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(query: String)(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""

"""),_display_(/*3.2*/main("Search")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
	"""),format.raw/*4.20*/("""
			"""),format.raw/*5.4*/("""<h1 class="product-header">Results for """),_display_(/*5.44*/query),format.raw/*5.49*/("""</h1>
			"""),_display_(/*6.5*/for(p <- products) yield /*6.23*/{_display_(Seq[Any](format.raw/*6.24*/("""
				"""),format.raw/*7.5*/("""<div class="panel-group container-fluid">
						<div class="panel panel-default">
								<div class="panel-heading">
		   							<h4 class="panel-title">
										<a data-toggle="collapse" href="#collapse"""),_display_(/*11.53*/p/*11.54*/.getId),format.raw/*11.60*/("""">"""),_display_(/*11.63*/p/*11.64*/.getName),format.raw/*11.72*/("""</a>
									</h4>
				 	 			</div>
									<div id="collapse"""),_display_(/*14.28*/p/*14.29*/.getId),format.raw/*14.35*/("""" class="panel-collapse collapse">
											<div class="panel-body">
													"""),_display_(/*16.15*/p/*16.16*/.getDescription),format.raw/*16.31*/("""
											"""),format.raw/*17.12*/("""</div>
											<div class="panel-footer">&euro; """),_display_(/*18.46*/("%.2f".format(p.getPrice))),format.raw/*18.73*/(""" """),format.raw/*18.74*/("""&nbsp;
													<button class="btn btn-success" type="submit">Buy Now</button>
											</div>
									</div>
									</div>
								</div>
							</br>
						""")))}),format.raw/*25.8*/("""
	"""),format.raw/*26.2*/("""</div>
"""),format.raw/*27.17*/("""
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(query:String,products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(query)(products)

  def f:((String) => (List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (query) => (products) => apply(query)(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 13 14:29:07 GMT 2017
                  SOURCE: /media/sf_student/CA/Part2/play-java-seed/app/views/search.scala.html
                  HASH: a06898165d3cbb1049487f4b17ca1779bb9297b4
                  MATRIX: 970->1|1112->48|1142->53|1164->67|1203->69|1233->90|1264->95|1330->135|1355->140|1391->151|1424->169|1462->170|1494->176|1732->387|1742->388|1769->394|1799->397|1809->398|1838->406|1932->473|1942->474|1969->480|2083->567|2093->568|2129->583|2170->596|2250->649|2298->676|2327->677|2532->852|2562->855|2598->879|2631->882
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|43->11|43->11|43->11|43->11|43->11|43->11|46->14|46->14|46->14|48->16|48->16|48->16|49->17|50->18|50->18|50->18|57->25|58->26|59->27|60->28
                  -- GENERATED --
              */
          