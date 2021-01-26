fun main() {
    val input = readLine()!!.toString()
    for (char in input) {
        if (char.isDigit()) {
            print(char)
            break
        } else {
            continue
        }
    }
}