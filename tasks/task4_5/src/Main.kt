// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size !=1) {
        println("Only need to input 1 number for max")
        exitProcess(1)
    }
    val max = args[0].toLong()
    var sum = 0L
    for (x in 1..max step 2) {
        sum += x
    }
    println("$sum is the sum of the odd integers from 1 to $max")
}
