// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/lavanya/Documents/Dev/accidentBack/conf/routes
// @DATE:Wed Apr 24 13:53:27 IST 2019


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
