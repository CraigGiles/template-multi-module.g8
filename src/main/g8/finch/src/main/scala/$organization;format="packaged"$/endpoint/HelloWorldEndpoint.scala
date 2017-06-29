package $organization$
package endpoint

import io.finch._

object HelloWorldEndpoint {
  val path = "hello"
  case class HelloData(id: Long, content: String)

  def getHello: Endpoint[HelloData] = get(path) {
    Ok(HelloData(1L, "Hello World"))
  }
}
