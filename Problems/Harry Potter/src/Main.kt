fun main() {
    val house = readLine()!!.toString()
    when (house) {
        "gryffindor" -> println("bravery")
        "hufflepuff" -> println("loyalty")
        "slytherin" -> println("cunning")
        "ravenclaw" -> println("intellect")
        else -> println("not a valid house")
    }
}