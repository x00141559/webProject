
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/webProject/Part2/play-java-seed/conf/routes
// @DATE:Thu Dec 21 14:01:24 GMT 2017


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
