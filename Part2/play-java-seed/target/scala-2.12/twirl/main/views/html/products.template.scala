
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),_display_(/*3.2*/main("Products",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
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

  def render(products:List[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,user)

  def f:((List[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,user) => apply(products,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 18 15:54:01 GMT 2017
                  SOURCE: /home/wdd/webapps/webProject/Part2/play-java-seed/app/views/products.scala.html
                  HASH: b0b94f4ad1e0e8718e1cf55648040a7deb96d076
                  MATRIX: 983->1|1135->58|1163->61|1192->82|1231->84|1262->106|1292->110|1367->160|1400->178|1438->179|1470->185|1691->379|1701->380|1728->386|1758->389|1768->390|1797->398|1876->450|1886->451|1913->457|2013->531|2023->532|2059->547|2093->554|2167->601|2215->628|2244->629|2411->766|2449->776|2487->802|2519->804
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|38->6|38->6|38->6|39->7|43->11|43->11|43->11|43->11|43->11|43->11|46->14|46->14|46->14|48->16|48->16|48->16|49->17|50->18|50->18|50->18|57->25|58->26|59->27|60->28
                  -- GENERATED --
              */
          