package $organization$

object WebServer {
  import com.twitter.finagle.http.{Request, Response}
  import com.twitter.finagle.{Http, Service}
  import com.twitter.util.Await
  import io.finch._
  import io.finch.circe._
  import io.circe.generic.auto._

  import $organization$.endpoint._

  // Endpoints
  val api: Service[Request, Response] = (
      HelloWorldEndpoint.getHello
    ).handle({
    case e => NotFound(new Exception(e.toString))
  }).toServiceAs[Application.Json]

  // Do any final shutdown logic here, if any
  def shutdown(): Unit = {}

  def main(args: Array[String]): Unit = {
    val server = Http.server.serve(":8080", api)
    Await.ready(server)
    shutdown()
  }
}
