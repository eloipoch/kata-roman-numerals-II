fun transform(arabic: Int): String {
    return "I".repeat(arabic)
        .replace("IIIII", "V")
        .replace("IIII", "IV")
}
