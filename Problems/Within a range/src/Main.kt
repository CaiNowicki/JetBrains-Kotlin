fun main() {
    val rangea = readLine()!!.toInt()
    val rangeb = readLine()!!.toInt()
    val rangec = readLine()!!.toInt()
    val ranged = readLine()!!.toInt()
    val num = readLine()!!.toInt()
    if (num in rangea..rangeb || num in rangec..ranged) {
        print(true)
    } else {
        print(false)
    }
}