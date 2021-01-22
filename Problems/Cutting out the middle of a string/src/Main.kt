fun main() {
    val text = readLine()!!.toString()
    if (text.length % 2 != 0) {
        val half = text.length / 2
        print(text.substring(0,half))
        print(text.substring(half+1))
    } else {
        val half = text.length / 2
        print(text.substring(0, half-1))
        print(text.substring(half+1))
    }
}