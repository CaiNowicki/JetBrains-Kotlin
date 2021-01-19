fun main(args: Array<String>) {
    val num = readLine()!!.toInt()
    val ten = 10
    val hundred = 100
    val last = num % ten
    val sub = num - last
    val tens = (sub % 100) / ten
    print(tens)
}