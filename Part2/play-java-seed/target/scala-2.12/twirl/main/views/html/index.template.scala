
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
				<h1></h1>
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

			<html lang="en">
				<head>
				  <title>Bootstrap Example</title>
				  <meta charset="utf-8">
				  <meta name="viewport" content="width=device-width, initial-scale=1">
				  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
				  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
				  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
				</head>
				<body>
				
				<div class="jumbotron text-center">
				  <h1> Welcome to Software.ie</h1>
				  <p></p> 
				</div>
				  
				<div class="container">
				  <div class="row">
					<div class="col-sm-4">
					  <h3>Purchase Products</h3>
					  <p>Click Purchase to buy now</p>
					
					</div>
					<div class="col-sm-4">
					  <h3>Login Details</h3>
					  <p>To log in you must be admin</p>
					  <p>Login to update and delete Products</p>
					</div>
					<div class="col-sm-4">
					  <h3>This weeks offer</h3> 
					  <p>Destiny 4 only 79.99 Euro.</p>
					  <p>Get it while its hot</p>
					</div>
				  </div>
				  <!DOCTYPE html>
				  <html lang="en">
				  <head>
					<title>Bootstrap Example</title>
					<meta charset="utf-8">
					<meta name="viewport" content="width=device-width, initial-scale=1">
					<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
					<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
					<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
				  </head>
				  <body>
				  
				  <div class="container">
					<h3>Not a member?</h3>
					<p>Sign in below for offers and more.</p>
					<a href="/login" data-toggle="tooltip" title="Login/SignUp">Sign up/Login</a>
				  </div>
				  
				  <script>
				  $(document).ready(function()"""),format.raw/*96.35*/("""{"""),format.raw/*96.36*/("""
					  """),format.raw/*97.8*/("""$('[data-toggle="tooltip"]').tooltip();   
				  """),format.raw/*98.7*/("""}"""),format.raw/*98.8*/(""");
				  </script>
				  
				  </body>
				  </html>
				  
				</div>
			"""),format.raw/*105.19*/("""
""")))}),format.raw/*106.2*/("""
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
                  DATE: Thu Dec 21 14:47:45 GMT 2017
                  SOURCE: /home/wdd/webapps/webProject/Part2/play-java-seed/app/views/index.scala.html
                  HASH: 2f0d9afab551ef79544e94ea62c94d938da60ebe
                  MATRIX: 980->1|1133->59|1161->62|1186->79|1225->81|1255->85|1343->163|1373->167|1782->549|1797->555|1858->595|1955->665|1970->671|2031->711|2129->782|2144->788|2201->824|2298->894|2313->900|2370->936|4716->3254|4745->3255|4780->3263|4856->3312|4884->3313|4988->3403|5021->3405
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|40->8|41->9|50->18|50->18|50->18|54->22|54->22|54->22|58->26|58->26|58->26|61->29|61->29|61->29|128->96|128->96|129->97|130->98|130->98|137->105|138->106
                  -- GENERATED --
              */
          