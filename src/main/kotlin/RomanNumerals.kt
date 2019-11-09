fun transform(arabic: Int): String {
    val transformations = listOf(
        "IIIII" to "V",
        "IIII" to "IV",
        "VV" to "X",
        "VIV" to "IX",
        "XXXXX" to "L",
        "XXXX" to "XL",
        "LL" to "C",
        "LXL" to "XC"
    )

    return transform("I".repeat(arabic), transformations)
}

private fun transform(initial: String, transformations: List<Pair<String, String>>) =
    transformations.fold(initial) { current, (value, into) ->
        current.replace(value, into)
    }
