fun main() {
    val wordInput = readLine()!!.toString().toLowerCase()
    for (char in "abcdefghijklmnopqrstuvwxyz") {
        if (char in wordInput) {
            continue
        } else {
            print(char)
        }
    }
}