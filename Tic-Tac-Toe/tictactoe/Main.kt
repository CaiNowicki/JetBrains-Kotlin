package tictactoe

fun makeBoard(input: String): String {
    var gameBoard = ""
    repeat(9){
        gameBoard += "-"
    }
    gameBoard += "\n"
    gameBoard += "| " + input[0] + " " + input[1] + " " + input[2] + " " + "|"
    gameBoard += "\n"
    gameBoard += "| "
    for (i in 1..3) {
        gameBoard += input[i + 2] + " "
    }
    gameBoard += "|"
    gameBoard += "\n"
    gameBoard += "| "
    for (i in 1..3) {
        gameBoard += input[i + 5] + " "
    }
    gameBoard += "|"
    gameBoard += "\n"
    repeat(9){
        gameBoard += "-"
    }
    print(gameBoard)
    return gameBoard

}

fun findWinner(input: String): String {
    val inputList = charArrayOf(input[0], input[1], input[2], input[3],
        input[4], input[5], input[6], input[7], input[8])
    val threeInARowSets = listOf(listOf(0,1,2),
        listOf(3,4,5), listOf(6,7,8), listOf(0,3,6),
        listOf(1,4,7), listOf(2,5,8), listOf(0,4,8), listOf(2,4,6))
    var winners = 0
    var winner = "".toCharArray()
    for (group in threeInARowSets) {
        if (inputList[group[0]] == inputList[group[1]] &&
            inputList[group[1]] == inputList[group[2]]) {
            winners += 1
            winner = charArrayOf(inputList[group[0]])
        }
    }
    if (!winner.contentEquals("".toCharArray()) && winners == 1) {
        return ("$ wins")
    }
    else if (winners == 0 && "_".toCharArray()[0] in inputList) {
        return ("Game not finished")
    }
    else if (winners == 0 && "_".toCharArray()[0] !in inputList) {
        return ("Draw")
    }
    else if (winners > 1) {
        return ("Impossible")
    } else {
        return ("Game not finished")
    }
}
fun getMove(input: String): String {
    println()
    println("Enter coordinates of next move: ")
    val nextMove = readLine()!!.toString()
    return nextMove(nextMove, input)
}

fun nextMove(moveInput: String, boardInput: String): String {
    var coordX = moveInput[0]
    var coordY = moveInput[2]
    val boardArray = arrayOf(
        boardInput.slice(0..2).toCharArray(),
        boardInput.slice(3..5).toCharArray(), boardInput.slice(6..8).toCharArray()
    )
    if (coordX.toString().toInt() > 3 || coordY.toString().toInt() > 3) {
        println("Coordinates should be from 1 to 3!")
        return getMove(boardInput)
    }

    else if (!coordX.isDigit() || !coordY.isDigit()) {
        println("You should enter numbers!")
        return getMove(boardInput)
    } else {
        coordX -= 1
        coordY -= 1
        if (boardArray[coordX.toString().toInt()][coordY.toString().toInt()].toString() != "_") {
            println("This cell is occupied! Choose another one!")
        return getMove(boardInput)
        } else {
            boardArray[coordX.toString().toInt()][coordY.toString().toInt()] = "X".toCharArray()[0]
            var newBoard = ""
            for (subset in boardArray) {
                for (value in subset) {
                    newBoard += value
                }
            }
            return makeBoard(newBoard)

        }

    }
}
fun startGame(): String {
    println("---------")
    for (i in 1..3) {
        println("|       |")
    }
    println("---------")
    return ("_________")
}

fun main() {
    val firstBoard = startGame()
    val gameBoard = getMove(firstBoard)
    var gameString = gameBoard.replace("-","")
    gameString = gameString.replace("|", "")
    gameString = gameString.replace("\n", "")
    var isOver = findWinner(gameString)
    while (isOver != "Game not finished") {
        getMove(gameString)
        gameString = gameBoard.replace("-","")
        gameString = gameString.replace("|", "")
        gameString = gameString.replace("\n", "")
        isOver = findWinner(gameString)
    }
    println()
    println(isOver)
}