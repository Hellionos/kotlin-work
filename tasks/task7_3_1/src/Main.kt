// Task 7.3.1: list element access
//val numbers = listOf(9, 3, 6, 2, 8, 5)
//println(numbers)
//
fun main() {
    val numbers = mutableListOf(2, 4, 6, 3, 8)
    println(numbers)
    println(numbers[0])
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    numbers.add(1)
    println(numbers)
}