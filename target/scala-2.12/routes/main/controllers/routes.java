// @GENERATOR:play-routes-compiler
// @SOURCE:D:/e-business/play-products-crud-slick/conf/routes
// @DATE:Mon May 28 22:19:49 CEST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseOpinionController OpinionController = new controllers.ReverseOpinionController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCategoryController CategoryController = new controllers.ReverseCategoryController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProductController ProductController = new controllers.ReverseProductController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseOrderController OrderController = new controllers.ReverseOrderController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBasketController BasketController = new controllers.ReverseBasketController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseKeywordController KeywordController = new controllers.ReverseKeywordController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseOpinionController OpinionController = new controllers.javascript.ReverseOpinionController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCategoryController CategoryController = new controllers.javascript.ReverseCategoryController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProductController ProductController = new controllers.javascript.ReverseProductController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseOrderController OrderController = new controllers.javascript.ReverseOrderController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBasketController BasketController = new controllers.javascript.ReverseBasketController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseKeywordController KeywordController = new controllers.javascript.ReverseKeywordController(RoutesPrefix.byNamePrefix());
  }

}
