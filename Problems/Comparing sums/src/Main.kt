// write your function here

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}

fun isGreater(int1: Int, int2: Int, int3: Int, int4: Int): Boolean {
    val sum1 = int1 + int2
    val sum2 = int3 + int4
    return sum1 > sum2
}