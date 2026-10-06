// Task 5.5: main program
import kotlin.system.exitProcess
fun main(args: Array<String>) {
    if (args.size !=2) {
        println("Need two words to check for anagrams")
        exitProcess(1)
    }
    val word1 = args[0]
    val word2 = args[1]
    //val output = anagrams(word1, word2)
    if (word2 anagramOf word1) {
        println("${word1} and ${word2} are anagrams!")
    }
    else {
        println("${word1} and ${word2} are not anagrams!")
    }
}