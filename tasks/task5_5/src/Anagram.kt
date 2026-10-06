// Task 5.5: anagrams() function

//fun anagrams(first: String, second: String): Boolean {
//    if (first.length != second.length) {
//        return false
//    }
//    val firstChars = first.lowercase().toList().sorted()
//    val secondChars = second.lowercase().toList().sorted()
//    return firstChars == secondChars
//}


infix fun String.anagramOf(str: String) = this.lowercase().toList().sorted() == str.lowercase().toList().sorted()