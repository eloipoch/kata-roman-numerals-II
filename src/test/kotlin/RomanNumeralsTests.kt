import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class RomanNumeralsTests : StringSpec({
    "it should transform an arabic number into a roman number" {
        forall(
            row(1, "I"),
            row(2, "II"),
            row(3, "III"),
            row(4, "IV")
        ) { arabic, roman ->
            transform(arabic) shouldBe roman
        }
    }
})
