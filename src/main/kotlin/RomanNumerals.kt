typealias Arabic = Int
typealias Roman = String

data class Transformation(val arabic: Arabic, val roman: Roman)

infix fun <Int, String> Int.to(that: String) = Transformation(this as Arabic, that as Roman)

typealias Transformations = List<Transformation>

val transformations: Transformations = listOf(
    1 to "I",
    4 to "IV",
    5 to "V",
    9 to "IX",
    10 to "X",
    40 to "XL",
    50 to "L",
    90 to "XC",
    100 to "C",
    400 to "CD",
    500 to "D",
    900 to "CM",
    1000 to "M"
)

fun transform(number: Arabic) = transformations.foldRight(number to "", transform()).roman

private fun transform(): (Transformation, Transformation) -> Transformation =
    { transformation, result -> transform(result, transformation) }

private tailrec fun transform(result: Transformation, transformation: Transformation): Transformation =
    if (result.arabic < transformation.arabic) result else transform(
        result.arabic - transformation.arabic to result.roman + transformation.roman,
        transformation
    )
