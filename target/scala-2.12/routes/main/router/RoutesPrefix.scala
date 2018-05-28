// @GENERATOR:play-routes-compiler
// @SOURCE:D:/e-business/play-products-crud-slick/conf/routes
// @DATE:Mon May 28 22:04:18 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
