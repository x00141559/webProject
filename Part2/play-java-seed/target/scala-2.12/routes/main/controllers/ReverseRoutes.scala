
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/conf/routes
// @DATE:Tue Dec 19 00:27:27 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def addProductSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addProductSubmit")
    }
  
    // @LINE:6
    def search(query:String = "All"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search" + play.core.routing.queryString(List(if(query == "All") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("query", query)))))
    }
  
    // @LINE:4
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:7
    def products(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:8
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:5
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:1
    def index(cat:Long = 0L): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(cat == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:9
    def product(id:Long = 0L): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product" + play.core.routing.queryString(List(if(id == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:2
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addProduct")
    }
  
  }

  // @LINE:11
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def loginSubmit(): Call = {
    
      () match {
      
        // @LINE:12
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
      
      }
    
    }
  
    // @LINE:14
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:11
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:18
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
