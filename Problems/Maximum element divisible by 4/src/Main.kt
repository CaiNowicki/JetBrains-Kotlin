fun main() {
    val reps = readLine()!!.toInt()
    var max = 0
    repeat(reps) {
        val num = readLine()!!.toInt()
        if (num % 4 == 0) {
            if (num > max) {
                max = num
            }
        }
    }
    print(max)
}