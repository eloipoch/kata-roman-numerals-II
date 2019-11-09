fun transform(arabic: Int): String {
    return "I".repeat(arabic)
        .replace("IIIIIIIII", "IX")
        .replace("IIIII", "V")
        .replace("IIII", "IV")
}
