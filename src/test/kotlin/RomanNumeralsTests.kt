import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class RomanNumeralsTests : StringSpec({
    "it should transform 1 into I" {
        transform(1) shouldBe "I"
    }
})
