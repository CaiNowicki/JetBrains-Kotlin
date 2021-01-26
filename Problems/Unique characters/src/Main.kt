fun main() {
    var result = 0
    val input = readLine()!!.toString()
    for (char in 'a'..'z') {
        if (char in input) {
            if (char in input.substringAfter(char)) {
                continue
            } else {
                result += 1
            }

        }
    }
    println(result)
}
