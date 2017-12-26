package xmasdinner


fun main(args: Array<String>) {
    var line = readLine()
    while (line != null) {
        val newWord = hideEveryOtherLetter(line)
        println(newWord)
        line = readLine()
    }
}

fun hideEveryOtherLetter(line:String) :String {
    val letters = mutableListOf<Char>()
    line.forEachIndexed { i, c ->
        run {
            when {
                c == ' ' -> {
                    letters.add(' ')
                    letters.add(' ')
                    letters.add(' ')
                }
                i % 2 == 1 -> letters.add('_')
                else -> letters.add(c.toUpperCase())
            }
        }
    }

    return letters.joinToString("")
}
