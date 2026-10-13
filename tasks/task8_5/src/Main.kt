// Task 8.5: example of using a higher-order function

fun main() {
    println("enter some text to process")
    val text = readln()
    val vowelCount = text.howMany { it.lowercase() in "aeiou" } // from example
    println("$vowelCount vowels found")
    val spaceCount = text.howMany { it == ' '}
    println("$spaceCount spaces found")
    val numberCount = text.howMany { it in "1234567890"}
    println("$numberCount numbers found")
    val actualCount = text.count({it.lowercase() in "aeiou"})
    println("The actual count found $actualCount vowels")
}
