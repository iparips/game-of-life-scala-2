package gol

import org.scalatest._

class DeadOrAliveSpec extends FunSpec with Matchers {
  describe("cell with less than 2 neighbours") {
    it("dies because of underpopulation") {
      DeadOrAlive.isAlive(currentlyAlive=true, neighboursCount = 0) shouldBe false
      DeadOrAlive.isAlive(currentlyAlive=true, neighboursCount = 1) shouldBe false
    }
  }

  describe("cell with 2 or 3 neighbours") {
    it("lives") {
      DeadOrAlive.isAlive(currentlyAlive=true, neighboursCount = 2) shouldBe true
      DeadOrAlive.isAlive(currentlyAlive=false, neighboursCount = 2) shouldBe false
      DeadOrAlive.isAlive(currentlyAlive=true, neighboursCount = 3) shouldBe true
      DeadOrAlive.isAlive(currentlyAlive=false, neighboursCount = 3) shouldBe true
    }
  }

  describe("cell with greater than 3 neighbours") {
    it("dies by over-crowding") {
      DeadOrAlive.isAlive(currentlyAlive = true, neighboursCount = 4) shouldBe false
    }
  }
}
