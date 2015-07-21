
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Pazhman/Documents/Projects/Play2/cat_db/conf/routes
// @DATE:Tue Jul 21 18:29:21 EEST 2015


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
