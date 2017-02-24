package $organization$

import org.scalatest.{Matchers, WordSpecLike}

class StackSpec extends WordSpecLike with Matchers {
  import Stack._

  "A stack" should {
    "push a value" in {
      val empty = List.empty[Int]
      val pushed = push(empty, 1)
      pushed._1 should be(List(1))
    }
  }
}
