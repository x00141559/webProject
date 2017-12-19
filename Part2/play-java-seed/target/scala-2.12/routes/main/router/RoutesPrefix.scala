
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/conf/routes
// @DATE:Tue Dec 19 00:27:27 GMT 2017


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
