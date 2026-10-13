// COMP2850 Portfolio: Week 3

fun median(numbers: List<Float>): Double {
    val len = numbers.size
    if (len == 0) {
        throw IllegalArgumentException("Size of data should not be zero")
    }
    val sorted = numbers.sorted()
    if (len % 2 == 0) {
        val midpoint = len/2
        val num2 = sorted[midpoint]
        val num1 = sorted[midpoint-1]
        val med = ((num1 + num2)/2).toDouble()

        return med
    }
    val midpoint = (len/2)
    val med = (sorted[midpoint]).toDouble()
    return med
}

fun displaystats(numbers: List<Float>) {
    println("Median: ${median(numbers)}")
    println("Mean: ${numbers.average()}")
    println("Max: ${numbers.maxOrNull()}")
    println("Min : ${numbers.minOrNull()}")
}
