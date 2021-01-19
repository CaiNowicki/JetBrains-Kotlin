fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val ten = 10
    val ones = n % ten
    val l = n / ten
    val tens = l % ten
    val m = l / ten
    val hundreds = m % ten
    println(ones.toString() + tens.toString() + hundreds.toString())

}