import java.util.Scanner
fun main(args: Array<String>) {
    var prod: Long = 1
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = (scanner.nextInt()-1)
    for (i in a..b){
        prod *= i
    }
    print(prod)
}