
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/conf/routes
// @DATE:Tue Dec 19 17:35:48 GMT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package controllers.javascript {

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def addProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProductSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addProductSubmit"})
        }
      """
    )
  
    // @LINE:6
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.search",
      """
        function(query0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search" + _qS([(query0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("query", query0))])})
        }
      """
    )
  
    // @LINE:4
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delProduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:7
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.products",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:8
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:5
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateProduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:1
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function(cat0) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(cat0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0))])})
        }
      """
    )
  
    // @LINE:9
    def product: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.product",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product" + _qS([(id0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0))])})
        }
      """
    )
  
    // @LINE:2
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addProduct"})
        }
      """
    )
  
    // @LINE:10
    def purchase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.purchase",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "purchase" + _qS([(id0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0))])})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginSubmit",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
          }
        
        }
      """
    )
  
    // @LINE:15
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:12
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
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
