// Task 12.8.1: demo program for Day enum class

fun main() {
    println("Please enter a day\n")
    try {
        val user = readln()
        val day = Day.valueOf(user)
    }
    catch (error: IllegalArgumentException) {
        println("Error: Can only accept capitalized weekdays.\n")
    }
    catch (error: Exception) {
        println("Error: Can only accept capitalized weekdays.\n")
    }

}