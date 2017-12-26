package xmasdinner


fun main(args: Array<String>) {

    println("XMAS-DINNER")
    println("Enter a word, or paste multiple lines and hit ENTER")

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
