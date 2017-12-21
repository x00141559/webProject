
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
                  DATE: Thu Dec 21 13:25:21 GMT 2017
                  SOURCE: /home/wdd/webapps/webProject/Part2/play-java-seed/app/views/search.scala.html
                  HASH: 9858a8dcf49051d52f7c4e0f7e0414d4d365aad9
                  MATRIX: 988->1|1155->73|1183->76|1210->95|1249->97|1278->117|1308->121|1374->161|1399->166|1434->176|1467->194|1505->195|1536->200|1770->407|1780->408|1807->414|1837->417|1847->418|1876->426|1967->490|1977->491|2004->497|2116->582|2126->583|2162->598|2200->608|2278->659|2326->686|2355->687|2533->835|2562->837|2597->860|2629->862
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|43->11|43->11|43->11|43->11|43->11|43->11|46->14|46->14|46->14|48->16|48->16|48->16|49->17|50->18|50->18|50->18|57->25|58->26|59->27|60->28
                  -- GENERATED --
              */
          