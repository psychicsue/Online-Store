// @GENERATOR:play-routes-compiler
// @SOURCE:D:/e-business/play-products-crud-slick/conf/routes
// @DATE:Mon May 28 22:19:49 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProductController_2: controllers.ProductController,
  // @LINE:9
  CategoryController_3: controllers.CategoryController,
  // @LINE:12
  BasketController_4: controllers.BasketController,
  // @LINE:15
  OpinionController_1: controllers.OpinionController,
  // @LINE:18
  KeywordController_0: controllers.KeywordController,
  // @LINE:21
  OrderController_6: controllers.OrderController,
  // @LINE:26
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductController_2: controllers.ProductController,
    // @LINE:9
    CategoryController_3: controllers.CategoryController,
    // @LINE:12
    BasketController_4: controllers.BasketController,
    // @LINE:15
    OpinionController_1: controllers.OpinionController,
    // @LINE:18
    KeywordController_0: controllers.KeywordController,
    // @LINE:21
    OrderController_6: controllers.OrderController,
    // @LINE:26
    Assets_5: controllers.Assets
  ) = this(errorHandler, ProductController_2, CategoryController_3, BasketController_4, OpinionController_1, KeywordController_0, OrderController_6, Assets_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductController_2, CategoryController_3, BasketController_4, OpinionController_1, KeywordController_0, OrderController_6, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProductController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproduct""", """controllers.ProductController.addProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductController.getProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category""", """controllers.CategoryController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCategory""", """controllers.CategoryController.addCategory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """controllers.CategoryController.getCategories"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basket""", """controllers.BasketController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproducttobasket""", """controllers.BasketController.addProductToBasket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basketproducts""", """controllers.BasketController.getProductsFromBasket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinion""", """controllers.OpinionController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addopinion""", """controllers.OpinionController.addOpinion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinons""", """controllers.OpinionController.getOpinion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """keyword""", """controllers.KeywordController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addkeyword""", """controllers.KeywordController.addKeyword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """keywords""", """controllers.KeywordController.getKeyword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order""", """controllers.OrderController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders""", """controllers.OrderController.getOrder"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderProducts""", """controllers.OrderController.orderProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProductController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProductController_index0_invoker = createInvoker(
    ProductController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ProductController_addProduct1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_ProductController_addProduct1_invoker = createInvoker(
    ProductController_2.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProduct",
      Nil,
      "POST",
      this.prefix + """addproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ProductController_getProducts2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductController_getProducts2_invoker = createInvoker(
    ProductController_2.getProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProducts",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_CategoryController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category")))
  )
  private[this] lazy val controllers_CategoryController_index3_invoker = createInvoker(
    CategoryController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "index",
      Nil,
      "GET",
      this.prefix + """category""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_CategoryController_addCategory4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCategory")))
  )
  private[this] lazy val controllers_CategoryController_addCategory4_invoker = createInvoker(
    CategoryController_3.addCategory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategory",
      Nil,
      "POST",
      this.prefix + """addCategory""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CategoryController_getCategories5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_CategoryController_getCategories5_invoker = createInvoker(
    CategoryController_3.getCategories,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategories",
      Nil,
      "GET",
      this.prefix + """categories""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BasketController_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basket")))
  )
  private[this] lazy val controllers_BasketController_index6_invoker = createInvoker(
    BasketController_4.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketController",
      "index",
      Nil,
      "GET",
      this.prefix + """basket""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BasketController_addProductToBasket7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproducttobasket")))
  )
  private[this] lazy val controllers_BasketController_addProductToBasket7_invoker = createInvoker(
    BasketController_4.addProductToBasket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketController",
      "addProductToBasket",
      Nil,
      "POST",
      this.prefix + """addproducttobasket""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BasketController_getProductsFromBasket8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basketproducts")))
  )
  private[this] lazy val controllers_BasketController_getProductsFromBasket8_invoker = createInvoker(
    BasketController_4.getProductsFromBasket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketController",
      "getProductsFromBasket",
      Nil,
      "GET",
      this.prefix + """basketproducts""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_OpinionController_index9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinion")))
  )
  private[this] lazy val controllers_OpinionController_index9_invoker = createInvoker(
    OpinionController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "index",
      Nil,
      "GET",
      this.prefix + """opinion""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_OpinionController_addOpinion10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addopinion")))
  )
  private[this] lazy val controllers_OpinionController_addOpinion10_invoker = createInvoker(
    OpinionController_1.addOpinion,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "addOpinion",
      Nil,
      "POST",
      this.prefix + """addopinion""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_OpinionController_getOpinion11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinons")))
  )
  private[this] lazy val controllers_OpinionController_getOpinion11_invoker = createInvoker(
    OpinionController_1.getOpinion,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "getOpinion",
      Nil,
      "GET",
      this.prefix + """opinons""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_KeywordController_index12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("keyword")))
  )
  private[this] lazy val controllers_KeywordController_index12_invoker = createInvoker(
    KeywordController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KeywordController",
      "index",
      Nil,
      "GET",
      this.prefix + """keyword""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_KeywordController_addKeyword13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addkeyword")))
  )
  private[this] lazy val controllers_KeywordController_addKeyword13_invoker = createInvoker(
    KeywordController_0.addKeyword,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KeywordController",
      "addKeyword",
      Nil,
      "POST",
      this.prefix + """addkeyword""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_KeywordController_getKeyword14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("keywords")))
  )
  private[this] lazy val controllers_KeywordController_getKeyword14_invoker = createInvoker(
    KeywordController_0.getKeyword,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KeywordController",
      "getKeyword",
      Nil,
      "GET",
      this.prefix + """keywords""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_OrderController_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order")))
  )
  private[this] lazy val controllers_OrderController_index15_invoker = createInvoker(
    OrderController_6.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "index",
      Nil,
      "GET",
      this.prefix + """order""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_OrderController_getOrder16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders")))
  )
  private[this] lazy val controllers_OrderController_getOrder16_invoker = createInvoker(
    OrderController_6.getOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrder",
      Nil,
      "GET",
      this.prefix + """orders""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_OrderController_orderProducts17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderProducts")))
  )
  private[this] lazy val controllers_OrderController_orderProducts17_invoker = createInvoker(
    OrderController_6.orderProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "orderProducts",
      Nil,
      "POST",
      this.prefix + """orderProducts""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Assets_versioned18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned18_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProductController_index0_route(params@_) =>
      call { 
        controllers_ProductController_index0_invoker.call(ProductController_2.index)
      }
  
    // @LINE:7
    case controllers_ProductController_addProduct1_route(params@_) =>
      call { 
        controllers_ProductController_addProduct1_invoker.call(ProductController_2.addProduct)
      }
  
    // @LINE:8
    case controllers_ProductController_getProducts2_route(params@_) =>
      call { 
        controllers_ProductController_getProducts2_invoker.call(ProductController_2.getProducts)
      }
  
    // @LINE:9
    case controllers_CategoryController_index3_route(params@_) =>
      call { 
        controllers_CategoryController_index3_invoker.call(CategoryController_3.index)
      }
  
    // @LINE:10
    case controllers_CategoryController_addCategory4_route(params@_) =>
      call { 
        controllers_CategoryController_addCategory4_invoker.call(CategoryController_3.addCategory)
      }
  
    // @LINE:11
    case controllers_CategoryController_getCategories5_route(params@_) =>
      call { 
        controllers_CategoryController_getCategories5_invoker.call(CategoryController_3.getCategories)
      }
  
    // @LINE:12
    case controllers_BasketController_index6_route(params@_) =>
      call { 
        controllers_BasketController_index6_invoker.call(BasketController_4.index)
      }
  
    // @LINE:13
    case controllers_BasketController_addProductToBasket7_route(params@_) =>
      call { 
        controllers_BasketController_addProductToBasket7_invoker.call(BasketController_4.addProductToBasket)
      }
  
    // @LINE:14
    case controllers_BasketController_getProductsFromBasket8_route(params@_) =>
      call { 
        controllers_BasketController_getProductsFromBasket8_invoker.call(BasketController_4.getProductsFromBasket)
      }
  
    // @LINE:15
    case controllers_OpinionController_index9_route(params@_) =>
      call { 
        controllers_OpinionController_index9_invoker.call(OpinionController_1.index)
      }
  
    // @LINE:16
    case controllers_OpinionController_addOpinion10_route(params@_) =>
      call { 
        controllers_OpinionController_addOpinion10_invoker.call(OpinionController_1.addOpinion)
      }
  
    // @LINE:17
    case controllers_OpinionController_getOpinion11_route(params@_) =>
      call { 
        controllers_OpinionController_getOpinion11_invoker.call(OpinionController_1.getOpinion)
      }
  
    // @LINE:18
    case controllers_KeywordController_index12_route(params@_) =>
      call { 
        controllers_KeywordController_index12_invoker.call(KeywordController_0.index)
      }
  
    // @LINE:19
    case controllers_KeywordController_addKeyword13_route(params@_) =>
      call { 
        controllers_KeywordController_addKeyword13_invoker.call(KeywordController_0.addKeyword)
      }
  
    // @LINE:20
    case controllers_KeywordController_getKeyword14_route(params@_) =>
      call { 
        controllers_KeywordController_getKeyword14_invoker.call(KeywordController_0.getKeyword)
      }
  
    // @LINE:21
    case controllers_OrderController_index15_route(params@_) =>
      call { 
        controllers_OrderController_index15_invoker.call(OrderController_6.index)
      }
  
    // @LINE:22
    case controllers_OrderController_getOrder16_route(params@_) =>
      call { 
        controllers_OrderController_getOrder16_invoker.call(OrderController_6.getOrder)
      }
  
    // @LINE:23
    case controllers_OrderController_orderProducts17_route(params@_) =>
      call { 
        controllers_OrderController_orderProducts17_invoker.call(OrderController_6.orderProducts)
      }
  
    // @LINE:26
    case controllers_Assets_versioned18_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned18_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
