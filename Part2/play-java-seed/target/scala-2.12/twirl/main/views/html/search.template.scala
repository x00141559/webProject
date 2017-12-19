
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

object search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,List[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(query: String)(products: List[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.74*/("""

"""),_display_(/*3.2*/main("Search",user)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
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
									"""),format.raw/*17.10*/("""</div>
										<div class="panel-footer">&euro; """),_display_(/*18.45*/("%.2f".format(p.getPrice))),format.raw/*18.72*/(""" """),format.raw/*18.73*/("""&nbsp;
										<button class="btn btn-success" type="submit">Buy Now</button>
								</div>
							</div>
						</div>
					</div>
				</br>
			""")))}),format.raw/*25.5*/("""
	"""),format.raw/*26.2*/("""</div>
"""),format.raw/*27.17*/("""
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(query:String,products:List[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(query)(products,user)

  def f:((String) => (List[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (query) => (products,user) => apply(query)(products,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 00:16:07 GMT 2017
                  SOURCE: C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/app/views/search.scala.html
                  HASH: 3be2d2d4a3294f6be407d1f5e923c5f1e7de44e0
                  MATRIX: 988->1|1155->73|1185->78|1212->97|1251->99|1281->120|1312->125|1378->165|1403->170|1439->181|1472->199|1510->200|1542->206|1780->417|1790->418|1817->424|1847->427|1857->428|1886->436|1980->503|1990->504|2017->510|2131->597|2141->598|2177->613|2216->624|2295->676|2343->703|2372->704|2557->859|2587->862|2623->886|2656->889
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|43->11|43->11|43->11|43->11|43->11|43->11|46->14|46->14|46->14|48->16|48->16|48->16|49->17|50->18|50->18|50->18|57->25|58->26|59->27|60->28
                  -- GENERATED --
              */
          