//Task 7.3.2

fun main() {
    val numbers = mutableListOf(2, 4, 6, 3, 8)
    println(numbers)
    println(numbers[0])
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    numbers[0] = 9
    numbers.add(1)
    println(numbers)
    val numbers2 = listOf(1,2,3,4,5)
    numbers.addAll(numbers2)
    println(numbers)
    numbers.remove(3)
    println(numbers)
    val numbers3 = listOf(1)
    numbers.removeAll(numbers3)
    println(numbers)
    numbers.clear()
    println(numbers)
}