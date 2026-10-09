// Task 7.7.1: program to compute stats for a numeric dataset

import kotlin.io.path.Path
import kotlin.io.path.readText

fun main(args: Array<String>) {
    println(med(readData(args[0])))

}