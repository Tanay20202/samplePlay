// @GENERATOR:play-routes-compiler
// @SOURCE:/C:/Users/TANAY SALVE/Desktop/letsplay/conf/routes


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
