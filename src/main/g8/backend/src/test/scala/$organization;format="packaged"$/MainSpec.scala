package $organization$

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class MainSpec extends FlatSpec with Matchers {
  "the main class" should "have a hello message" in {
    Main.hello should be "Hello World!"
  }
}
