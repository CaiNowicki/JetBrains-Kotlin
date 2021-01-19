fun main(args: Array<String>) {
    val str = readLine()!!
    val idx = readLine()!!.toInt()
    print("Symbol # $idx of the string \"$str\" is '${str[idx-1]}'")
}