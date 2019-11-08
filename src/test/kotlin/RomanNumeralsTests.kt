import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class RomanNumeralsTests : StringSpec({
    "it should transform 1 into I" {
        transform(1) shouldBe "I"
    }
    "it should transform 2 into II" {
        transform(2) shouldBe "II"
    }
})
