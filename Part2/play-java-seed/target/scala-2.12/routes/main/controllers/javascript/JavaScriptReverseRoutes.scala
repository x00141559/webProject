
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/College/Web/play-java-seed/conf/routes
// @DATE:Fri Nov 17 18:08:37 GMT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.search",
      """
        function(query0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search" + _qS([(query0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("query", query0))])})
        }
      """
    )
  
    // @LINE:11
    def purchase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.purchase",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "purchase"})
        }
      """
    )
  
    // @LINE:8
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.products",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:9
    def product: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.product",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product"})
        }
      """
    )
  
    // @LINE:7
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:10
    def basket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.basket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "basket"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
