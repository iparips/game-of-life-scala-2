package gol

import org.scalatest._

class DeadOrAliveSpec extends FunSpec with Matchers {
  describe("cell with 0 neighbours") {
    it("dies") {
      DeadOrAlive.isAlive(neighboursCount = 3) shouldBe true
    }
  }
}
