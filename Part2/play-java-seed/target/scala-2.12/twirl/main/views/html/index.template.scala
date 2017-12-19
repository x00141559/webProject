
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
			"""),format.raw/*4.4*/("""<div class="container-fluid">
				<h1>Welcome to Software.ie</h1>
			</div>
			
			"""),format.raw/*8.21*/("""
			"""),format.raw/*9.4*/("""<div id="myCarousel" class="carousel slide" data-ride="carousel">
				<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				</ol>
	
				<div class="carousel-inner">
				<div class="item active">
				<img src=""""),_display_(/*18.16*/routes/*18.22*/.Assets.versioned("images/windows2.jpg")),format.raw/*18.62*/("""" alt="Example 1">
				</div>
	
				<div class="item">
				<img src=""""),_display_(/*22.16*/routes/*22.22*/.Assets.versioned("images/windows1.jpg")),format.raw/*22.62*/("""" alt="Example 2">
				</div>
	
				<div class="item">
				 <img src=""""),_display_(/*26.17*/routes/*26.23*/.Assets.versioned("images/key2.jpg")),format.raw/*26.59*/("""" alt="Example 3">
				</div>
				 <div class="item">
				 <img src=""""),_display_(/*29.17*/routes/*29.23*/.Assets.versioned("images/key1.jpg")),format.raw/*29.59*/("""" alt="Example 4">
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
				<h4>To start shopping you can click "Products" to See all Products or Search for something you want</h4>
				<h4>Software.ie is a premium liscensed reseller of Software keys since 2017</h4>
			</div>
			"""),format.raw/*47.19*/("""
""")))}),format.raw/*48.2*/("""
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
                  DATE: Tue Dec 19 18:23:43 GMT 2017
                  SOURCE: C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/app/views/index.scala.html
                  HASH: 2ebba4198e086e703113e71cb83735d4a2506faf
                  MATRIX: 980->1|1133->59|1163->64|1188->81|1227->83|1258->88|1372->192|1403->197|1821->588|1836->594|1897->634|1998->708|2013->714|2074->754|2176->829|2191->835|2248->871|2348->944|2363->950|2420->986|3127->1680|3160->1683
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|40->8|41->9|50->18|50->18|50->18|54->22|54->22|54->22|58->26|58->26|58->26|61->29|61->29|61->29|79->47|80->48
                  -- GENERATED --
              */
          