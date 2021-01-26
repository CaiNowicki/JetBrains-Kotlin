fun main() {
    val input = readLine()!!.toString()
    when (input.length) {
        1 -> println(1)
        2 -> println(2)
        3 -> println(3)
        4 -> println(4)
        else -> println("longer than 4 digits")
    }
}