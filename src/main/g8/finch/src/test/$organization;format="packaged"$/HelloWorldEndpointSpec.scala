package $organization$

import io.finch._
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.prop.Checkers

class HelloWorldSpec extends FlatSpec with Matchers with Checkers {
  import $organization$.endpoint.HelloWorldEndpoint._

  behavior of "getHello endpoint"
  it should "return a HelloData object" in {
    val hello = HelloData(1L, "Hello World!")
    getHello(Input.get("/hello")).awaitValueUnsafe() shouldBe Some(hello)
  }

}
