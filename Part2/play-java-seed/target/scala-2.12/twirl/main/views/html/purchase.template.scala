
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

object purchase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.Product,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(p: models.Product, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

"""),_display_(/*3.2*/main("Purchase",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
		"""),format.raw/*4.21*/("""
		"""),format.raw/*5.3*/("""<div class="container-fluid">
				<h2>Purchase</h2>
				<strong><p> Here is a summary of your order</p></strong>
				"""),_display_(/*8.6*/if(p != null)/*8.19*/ {_display_(Seq[Any](format.raw/*8.21*/("""
					"""),format.raw/*9.6*/("""<div class="container-fluid">
						<!---Start Rachel -->
						<div class="product-container">
							<h4>"""),_display_(/*12.13*/p/*12.14*/.getName),format.raw/*12.22*/(""",&nbsp;&nbsp;&nbsp;&euro;"""),_display_(/*12.48*/("%.2f".format(p.getPrice))),format.raw/*12.75*/("""</h4>
						</div>
					<strong><p>To continue with your purchase please enter your details below</p></strong>	
				</div>
					<form>
						<div class="form-group col-md-12">
							<label for="name">Name:</label>
							<input type="name" class="form-control" id="name">
						</div>
						<div class="form-group col-md-8">
							<label for="cardno">Card Number:</label>
							<input type="cardno" class="form-control" id="cardno">
						</div>
						<div class="form-group col-md-4">
							<label for="ccn">CCN Number:</label>
							<input type="password" class="form-control" id="ccn">
						</div>
						&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" onclick="purchase()" class="btn btn-success">Purchase</a>
						<div class="container-fluid hidden">
							<h2>Thank you for your purchase!</h2>
						</div>
					</form>
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
					  <h3>Continue Browsing</h3>
				
					  <a href="/products" data-toggle="tooltip" title="Products!">Back to shopping</a>
					</div>
					
					<script>
					$(document).ready(function()"""),format.raw/*53.34*/("""{"""),format.raw/*53.35*/("""
						"""),format.raw/*54.7*/("""$('[data-toggle="tooltip"]').tooltip();   
					"""),format.raw/*55.6*/("""}"""),format.raw/*55.7*/(""");
				""")))}/*56.7*/else/*56.12*/{_display_(Seq[Any](format.raw/*56.13*/("""
					"""),format.raw/*57.6*/("""<h2>Product Not Found</h2>
				""")))}),format.raw/*58.6*/("""
		"""),format.raw/*59.3*/("""</div>
	"""),format.raw/*60.18*/("""
""")))}),format.raw/*61.2*/("""
"""))
      }
    }
  }

  def render(p:models.Product,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(p,user)

  def f:((models.Product,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (p,user) => apply(p,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 14:45:24 GMT 2017
                  SOURCE: /home/wdd/webapps/webProject/Part2/play-java-seed/app/views/purchase.scala.html
                  HASH: d7ccc3ea28c44f3ec1460364d7060742e752617e
                  MATRIX: 977->1|1116->45|1144->48|1173->69|1212->71|1242->92|1271->95|1414->213|1435->226|1474->228|1506->234|1641->342|1651->343|1680->351|1733->377|1781->404|3386->1981|3415->1982|3449->1989|3524->2037|3552->2038|3578->2047|3591->2052|3630->2053|3663->2059|3725->2091|3755->2094|3791->2118|3823->2120
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|40->8|40->8|40->8|41->9|44->12|44->12|44->12|44->12|44->12|85->53|85->53|86->54|87->55|87->55|88->56|88->56|88->56|89->57|90->58|91->59|92->60|93->61
                  -- GENERATED --
              */
          