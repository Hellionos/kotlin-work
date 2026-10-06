// Task 5.1.1: main program
import kotlin.system.exitProcess
fun main(args: Array<String>) {
    if (args.size !=2) {
        println("Need two words to check for anagrams")
        exitProcess(1)
    }
    val word1 = args[0]
    val word2 = args[1]
    val output = anagrams(word1, word2)
    if (output) {
        println("The two words are an anagram")
    }
    else {
        println("The two words are not an anagram")
    }
}