fun transform(arabic: Int): String {
    return "I".repeat(arabic)
        .replace("IIIIIIIIII", "X")
        .replace("IIIIIIIII", "IX")
        .replace("IIIII", "V")
        .replace("IIII", "IV")
}
