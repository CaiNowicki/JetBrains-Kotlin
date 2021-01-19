fun isVowel(letter: Char): Boolean {
    return letter.toLowerCase() == 'a' || letter.toLowerCase() == 'e'
            || letter.toLowerCase() == 'i' || letter.toLowerCase() == 'o'
            ||letter.toLowerCase() == 'u'
}

fun main() {

    val letter = readLine()!!.first()

    println(isVowel(letter))
}