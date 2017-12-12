
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
					"""),format.raw/*4.23*/("""
					"""),format.raw/*5.6*/("""<div id="myCarousel" class="carousel slide" data-ride="carousel">
							<ol class="carousel-indicators">
							<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
							<li data-target="#myCarousel" data-slide-to="1"></li>
							<li data-target="#myCarousel" data-slide-to="2"></li>
							</ol>
	
							<div class="carousel-inner">
							<div class="item active">
								<img src=""""),_display_(/*14.20*/routes/*14.26*/.Assets.versioned("images/Example1.png")),format.raw/*14.66*/("""" alt="Example 1">
							</div>
	
							<div class="item">
								<img src=""""),_display_(/*18.20*/routes/*18.26*/.Assets.versioned("images/Example2.png")),format.raw/*18.66*/("""" alt="Example 2">
							</div>
	
							<div class="item">
							 <img src=""""),_display_(/*22.20*/routes/*22.26*/.Assets.versioned("images/Example3.png")),format.raw/*22.66*/("""" alt="Example 3">
							</div>
								 <div class="item">
							 <img src=""""),_display_(/*25.20*/routes/*25.26*/.Assets.versioned("images/Example4.png")),format.raw/*25.66*/("""" alt="Example 4">
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
								<img src=""""),_display_(/*42.20*/routes/*42.26*/.Assets.versioned("images/Example1.png")),format.raw/*42.66*/("""" alt="Example 1">
								<p>Key Type: Gaming</p>
								<p>Price: €40.00</p>
					  </div>
					</div>
					"""),format.raw/*47.21*/("""
""")))}),format.raw/*48.2*/("""
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
                  SOURCE: E:/College/Web/play-java-seed/app/views/index.scala.html
                  HASH: 4256f38e1438ee2868f283c4c61f989677a3bc8b
                  MATRIX: 941->1|1037->3|1065->6|1085->18|1124->20|1157->43|1189->49|1623->456|1638->462|1699->502|1806->582|1821->588|1882->628|1989->708|2004->714|2065->754|2172->834|2187->840|2248->880|2864->1469|2879->1475|2940->1515|3079->1641|3111->1643
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|46->14|46->14|46->14|50->18|50->18|50->18|54->22|54->22|54->22|57->25|57->25|57->25|74->42|74->42|74->42|79->47|80->48
                  -- GENERATED --
              */
          