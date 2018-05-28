// @GENERATOR:play-routes-compiler
// @SOURCE:D:/e-business/play-products-crud-slick/conf/routes
// @DATE:Mon May 28 22:04:18 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:15
  class ReverseOpinionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def getOpinion(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinons")
    }
  
    // @LINE:15
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinion")
    }
  
    // @LINE:16
    def addOpinion(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addopinion")
    }
  
  }

  // @LINE:26
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def getCategories(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
    // @LINE:10
    def addCategory(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addCategory")
    }
  
    // @LINE:9
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category")
    }
  
  }

  // @LINE:6
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def addProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
  }

  // @LINE:21
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def orderProducts(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "orderProducts")
    }
  
    // @LINE:21
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "order")
    }
  
    // @LINE:22
    def getOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders")
    }
  
  }

  // @LINE:12
  class ReverseBasketController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def addProductToBasket(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproducttobasket")
    }
  
    // @LINE:12
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basket")
    }
  
    // @LINE:14
    def getProductsFromBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basketproducts")
    }
  
  }

  // @LINE:18
  class ReverseKeywordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "keyword")
    }
  
    // @LINE:20
    def getKeyword(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "keywords")
    }
  
    // @LINE:19
    def addKeyword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addkeyword")
    }
  
  }


}
