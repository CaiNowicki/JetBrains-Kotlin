import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val char1 = scanner.next().single()
    val char2 = scanner.next().single()
    val char3 = scanner.next().single()
    if (char1 + 1 == char2 && char2 + 1 == char3) {
        print(true)
    } else {
        print(false)
    }
}