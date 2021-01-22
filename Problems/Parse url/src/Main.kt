fun main() {
    val urlStrings = readLine()!!.toString().split("&")
    var password = ""
    for (str in urlStrings) {
        val parts = str.split("?")
        for (part in parts) {
            val subParts = part.split("=")
            if (subParts.size == 2) {
                if (subParts[1].isBlank()) {
                    val value = "not found"
                    print("${subParts[0]} : $value")
                } else {
                    val value = subParts[1]
                    print("${subParts[0]} : $value")
                }
            }
            if (subParts[0].toCharArray().contentEquals("pass".toCharArray()) &&
                subParts[1].isNotBlank()
            ) {
                password = subParts[1]
            }
            println()
        }
    }
    if (password.isNotBlank()) {
        print("password : $password")
    }

}