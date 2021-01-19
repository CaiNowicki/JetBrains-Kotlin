import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val rangea = scanner.nextInt()
    val rangeb = scanner.nextInt()
    if (num in rangea..rangeb) {
        print(true)
    }
    else {
        print(false)
    }
}