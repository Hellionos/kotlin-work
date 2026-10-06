// Task 4.3: grade calculation using a when expression

import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size !=3) {
        println("Error: 3 grademarks have not been provided")
        exitProcess(1)
    }
    val grade1 = args[0].toInt()
    val grade2 = args[1].toInt()
    val grade3 = args[2].toInt()
    val sum = (grade1 + grade2 + grade3).toDouble()
    val avg = (sum/3)
    val mark = avg.roundToInt()

    val grade = when (mark) {
        in 0..39   -> println("$mark is a Fail")
        in 40..69  -> println("$mark is a Pass")
        in 70..100 -> println("$mark is a Distinction")
        else       -> println("? $mark is not in range")
    }
}