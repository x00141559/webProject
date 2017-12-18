
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user:  models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""

"""),_display_(/*3.2*/main("Home",user)/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
					"""),format.raw/*4.23*/("""
					"""),format.raw/*5.6*/("""<div id="myCarousel" class="carousel slide" data-ride="carousel">
							<ol class="carousel-indicators">
							<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
							<li data-target="#myCarousel" data-slide-to="1"></li>
				
							<li data-target="#myCarousel" data-slide-to="2"></li>
							</ol>
	
							<div class="carousel-inner">
							<div class="item active">
								<img src=""""),_display_(/*15.20*/routes/*15.26*/.Assets.versioned("images/windows2.jpg")),format.raw/*15.66*/("""" alt="Example 1">
							</div>
	
							<div class="item">
								<img src=""""),_display_(/*19.20*/routes/*19.26*/.Assets.versioned("images/windows1.jpg")),format.raw/*19.66*/("""" alt="Example 2">
							</div>
	
							<div class="item">
							 <img src=""""),_display_(/*23.20*/routes/*23.26*/.Assets.versioned("images/key2.jpg")),format.raw/*23.62*/("""" alt="Example 3">
							</div>
								 <div class="item">
							 <img src=""""),_display_(/*26.20*/routes/*26.26*/.Assets.versioned("images/key1.jpg")),format.raw/*26.62*/("""" alt="Example 4">
							</div>
							</div>

							<a class="left carousel-control" href="#myCarousel" data-slide="prev">
							<span class="glyphicon glyphicon-chevron-left"></span>
							<span class="sr-only">Previous</span>
							</a>
							<a class="right carousel-control" href="#myCarousel" data-slide="next">
							<span class="glyphicon glyphicon-chevron-right"></span>
							<span class="sr-only">Next</span>
							</a>
						</div>

						<div class="container-fluid">
								<h2>Featured Product</h2>
								<h4>This weeks featured Product:</h4>
								<img src=""""),_display_(/*43.20*/routes/*43.26*/.Assets.versioned("images/Example1.png")),format.raw/*43.66*/("""" alt="Example 1">
								<p>Key Type: Gaming</p>
								<p>Price: €40.00</p>
					  </div>
					</div>
					"""),format.raw/*48.21*/("""
""")))}),format.raw/*49.2*/("""
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
                  SOURCE: /home/wdd/webapps/webProject/Part2/play-java-seed/app/views/index.scala.html
                  HASH: 5b83509b5da44f6d1274e83f9dbecc397787c8e5
                  MATRIX: 980->1|1133->59|1161->62|1186->79|1225->81|1258->104|1290->110|1729->522|1744->528|1805->568|1912->648|1927->654|1988->694|2095->774|2110->780|2167->816|2274->896|2289->902|2346->938|2962->1527|2977->1533|3038->1573|3177->1699|3209->1701
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|47->15|47->15|47->15|51->19|51->19|51->19|55->23|55->23|55->23|58->26|58->26|58->26|75->43|75->43|75->43|80->48|81->49
                  -- GENERATED --
              */
          