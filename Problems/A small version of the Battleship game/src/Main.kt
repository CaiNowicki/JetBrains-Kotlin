fun main() {
    val locations = readLine()!!.toString()
    var result = ""
    for (x in 1..5) {
        val newX = "$x "
        if (locations.contains(newX)) {
            continue
        } else if (locations.contains(x.toString())) {
            continue
        } else {
            result += newX
        }
    println(result.dropLast(1))
    }
}