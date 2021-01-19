import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("${scanner.nextInt()}:${scanner.nextInt()}:" +
            "${scanner.nextInt()} ${scanner.nextInt()}/${scanner.nextInt()}" +
            "/${scanner.nextInt()}")
}