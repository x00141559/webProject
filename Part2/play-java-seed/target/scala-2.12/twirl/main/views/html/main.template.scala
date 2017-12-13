
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
                    </div>
                </nav>
                <main>
                    """),_display_(/*41.22*/content),format.raw/*41.29*/("""
                """),format.raw/*42.17*/("""</main>
                
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
                  DATE: Wed Dec 13 13:57:36 GMT 2017
                  SOURCE: /media/sf_student/CA/Part2/play-java-seed/app/views/main.scala.html
                  HASH: 153e55124f5e5166cf0ba6e9995d0f9d854ac110
                  MATRIX: 966->21|1091->51|1121->55|1224->132|1249->137|1693->554|1708->560|1765->596|2026->830|2041->836|2100->874|2558->1305|2586->1324|2625->1325|2671->1340|2778->1420|2807->1440|2846->1441|2892->1456|3005->1542|3037->1565|3076->1566|3122->1581|3939->2371|3967->2378|4013->2396
                  LINES: 28->2|33->2|35->4|38->7|38->7|42->11|42->11|42->11|44->13|44->13|44->13|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|72->41|72->41|73->42
                  -- GENERATED --
              */
          