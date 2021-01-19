fun main(args: Array<String>) {
    val input = readLine()!!
    val inputs = input.split(" ")
    val input1 = inputs[0].toLowerCase()
    val input2 = inputs[1].toLowerCase()
    if (input1 == input2) {
        print(true)
    } else {
        print(false)
    }
}
