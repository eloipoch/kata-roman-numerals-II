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
            row(4, "IV"),
            row(5, "V"),
            row(6, "VI"),
            row(7, "VII"),
            row(8, "VIII"),
            row(9, "IX"),
            row(10, "X"),
            row(11, "XI"),
            row(12, "XII"),
            row(13, "XIII"),
            row(14, "XIV"),
            row(15, "XV"),
            row(16, "XVI"),
            row(17, "XVII"),
            row(18, "XVIII"),
            row(19, "XIX"),
            row(20, "XX"),
            row(30, "XXX"),
            row(39, "XXXIX"),
            row(40, "XL"),
            row(50, "L"),
            row(60, "LX"),
            row(70, "LXX"),
            row(80, "LXXX"),
            row(90, "XC"),
            row(100, "C"),
            row(200, "CC"),
            row(300, "CCC")
        ) { arabic, roman ->
            transform(arabic) shouldBe roman
        }
    }
})
