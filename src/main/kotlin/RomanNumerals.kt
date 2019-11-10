typealias Arabic = Int
typealias Roman = String
typealias Transformation = Pair<Arabic, Roman>
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

fun transform(number: Arabic) = transformations.foldRight(number to "") { (value, into), (arabic, roman) ->
    var result = arabic to roman

    while (result.first >= value) {
        result = result.first - value to result.second + into
    }

    result
}.second
