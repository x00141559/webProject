
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /* Start Jordan */
  def apply/*2.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.32*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Software.ie - """),_display_(/*7.31*/title),format.raw/*7.36*/("""</title>
		    <meta charset="UTF-8">        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("styles/main.css")),format.raw/*11.96*/("""">
		    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script> 
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("scripts/search.js")),format.raw/*13.67*/(""""></script>
    </head>
    <body>
        <div id="outer-content-wrapper">
            <header>
                <h1>Software.ie</h1>
            </header>
            <div id ="content-wrapper">
                <nav class="navbar navbar-default">
                    <div class="container-fluid" style="background-color: rgb(215,215,215)">
                      <ul class="nav navbar-nav">
                        <li """),_display_(/*24.30*/if(title == "Home")/*24.49*/{_display_(Seq[Any](format.raw/*24.50*/("""class="active"""")))}),format.raw/*24.65*/("""><a href="/" style="color: #00d7d7">Home</a></li>
                        <li """),_display_(/*25.30*/if(title == "About")/*25.50*/{_display_(Seq[Any](format.raw/*25.51*/("""class="active"""")))}),format.raw/*25.66*/("""><a href="/about" style="color: #00d7d7">About</a></li>
                        <li """),_display_(/*26.30*/if(title == "Products")/*26.53*/{_display_(Seq[Any](format.raw/*26.54*/("""class="active"""")))}),format.raw/*26.69*/("""><a href="/products" style="color: #00d7d7">Products</a></li>
                      </ul>
                      <form class="navbar-form navbar-left pull-right">
                        <div class="input-group">
                          <input type="text" id="searchContent" class="form-control" placeholder="Search">
                          <div class="input-group-btn">
                            <button class="btn btn-default" type="button" onclick="return search()">
                              <i class="glyphicon glyphicon-search"></i>
                            </button>
                          </div>
                        </div>
                      </form>
                      <a href="/basket"><img src=""""),_display_(/*38.52*/routes/*38.58*/.Assets.versioned("images/shopping-cart.png")),format.raw/*38.103*/("""" class="basket"/></a>
                    </div>
                </nav>
                <main>
                    """),_display_(/*42.22*/content),format.raw/*42.29*/("""
                """),format.raw/*43.17*/("""</main>
                
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 17 19:46:35 GMT 2017
                  SOURCE: E:/College/Web/play-java-seed/app/views/main.scala.html
                  HASH: 09893a546da2a4857032db113d5437a8888f5bc1
                  MATRIX: 966->20|1091->50|1119->52|1219->126|1244->131|1684->544|1699->550|1756->586|2015->818|2030->824|2089->862|2536->1282|2564->1301|2603->1302|2649->1317|2755->1396|2784->1416|2823->1417|2869->1432|2981->1517|3013->1540|3052->1541|3098->1556|3857->2288|3872->2294|3939->2339|4083->2456|4111->2463|4156->2480
                  LINES: 28->2|33->2|35->4|38->7|38->7|42->11|42->11|42->11|44->13|44->13|44->13|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|69->38|69->38|69->38|73->42|73->42|74->43
                  -- GENERATED --
              */
          