// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val filePath = Path("test.txt")
    var sometext = "This is some test that is needed to do task 3.5\n"
    filePath.writeText(sometext)
    var newtext = "Different text from the previous text (not obvious)"
    filePath.appendText(newtext)
    val fileContents = filePath.readText()
    println(fileContents)
}