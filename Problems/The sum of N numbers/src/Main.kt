import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val reps = scanner.nextInt()
    var sum = 0
    repeat (reps) {
        sum += scanner.nextInt()
    }
    print(sum)
}