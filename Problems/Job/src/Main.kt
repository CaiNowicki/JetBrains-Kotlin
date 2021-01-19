fun main() {
    val age = readLine()!!.toInt()
    if (age in 18..59) {
        print(true)
    } else {
        print(false)
    }
}