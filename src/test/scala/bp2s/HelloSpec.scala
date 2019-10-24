package bp2s

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    "Hello" shouldEqual "Hello"
  }
}
