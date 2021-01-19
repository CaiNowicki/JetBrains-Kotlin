import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val ch1 = scanner.next()[0]
    val ch2 = scanner.next()[0]
    val ch3 = scanner.next()[0]
    val ch4 = scanner.next()[0]
    if (ch1.isDigit()) {
        print(true)
    } else {
        print(false)
    }
    print("\\")
    if (ch2.isDigit()) {
        print(true)
    } else {
        print(false)
    }
    print("\\")
    if (ch3.isDigit()) {
        print(true)
    } else {
        print(false)
    }
    print("\\")
    if (ch4.isDigit()) {
        print(true)
    } else {
        print(false)
    }
}