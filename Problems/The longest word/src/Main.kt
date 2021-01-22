fun main() {
    val text = readLine()!!.toString()
    val textArray = text.split(" ").asReversed()
    var longestWord = ""
    var longestLength = 0
    for (word in textArray) {
        if (word.length >= longestLength) {
            longestWord = word
            longestLength = word.length
        }
    }
    print(longestWord)
}