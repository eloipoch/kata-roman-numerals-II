fun transform(arabic: Int): String {
    val transformations = listOf(
        1 to "I",
        4 to "IV",
        5 to "V",
        9 to "IX",
        10 to "X",
        40 to "XL",
        50 to "L",
        90 to "XC",
        100 to "C"
    )

    return transform(arabic, transformations).second
}

private fun transform(arabic: Int, transformations: List<Pair<Int, String>>) =
    transformations.foldRight(arabic to "") { (value, into), (arabic, roman) ->
        var result = arabic to roman

        while (result.first >= value) {
            result = result.first - value to result.second + into
        }

        result
    }
