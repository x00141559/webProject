
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/CA3/Part2/play-java-seed/conf/routes
// @DATE:Tue Dec 12 16:33:27 GMT 2017


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
