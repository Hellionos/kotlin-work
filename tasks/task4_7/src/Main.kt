// Task 4.7: finding the longest line in a file
import kotlin.io.path.*

fun main(args: Array<String>) {
    val filePath = Path(args[0])

    var linenumber = 0
    var longestline = ""
    var longestlinenumber = 0
    filePath.useLines {
        for (line in it) {
            linenumber += 1
            if (line.length > longestline.length) {
                longestline = line
                longestlinenumber = linenumber
            }
        }
        println("Line $longestlinenumber is the longest (length = ${longestline.length})")
    }
}