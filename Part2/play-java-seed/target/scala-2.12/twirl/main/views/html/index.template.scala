
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
                  DATE: Fri Dec 15 14:44:40 GMT 2017
                  SOURCE: C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/app/views/index.scala.html
                  HASH: f3d5d045bf350201facc91045ea66585d7ab701e
                  MATRIX: 941->1|1037->3|1067->8|1087->20|1126->22|1160->46|1193->53|1636->469|1651->475|1712->515|1823->599|1838->605|1899->645|2010->729|2025->735|2086->775|2196->858|2211->864|2272->904|2905->1510|2920->1516|2981->1556|3125->1687|3158->1690
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|46->14|46->14|46->14|50->18|50->18|50->18|54->22|54->22|54->22|57->25|57->25|57->25|74->42|74->42|74->42|79->47|80->48
                  -- GENERATED --
              */
          