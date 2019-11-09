fun transform(arabic: Int): String {
    return "I".repeat(arabic)
        .replace("IIIII", "V")
        .replace("IIII", "IV")
        .replace("VV", "X")
        .replace("VIV", "IX")
        .replace("XXXX", "XL")
}
