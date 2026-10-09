// Task 7.7.1: statistics functions

fun med(numbers: List): Double {
    if (numbers % 2 == 0) {
        val len = numbers.length
        val midpoint = len/2

        val num2 = numbers[midpoint]
        val num1 = numbers[midpoint-1]
        val med = (num1 + num2)/2
        val min = numbers.min()
        val max = numbers.max()
        val sum = numbers.sum()
        val mean = sum/len

        return med; mean; max; min
    }
    val len = numbers.length
    val midpoint = (len/2) - 0.5
    val med = (numbers[midpoint]).toDouble()
    val min = numbers.min()
    val max = numbers.max()
    val sum = numbers.sum()
    val mean = sum/len
    return med; mean; max; min
}

//fun otherstats(numbers: List): Double {

//}