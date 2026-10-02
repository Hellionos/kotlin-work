// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    val side1 = args[0].toDouble()
    val side2 = args[1].toDouble()
    val side3 = args[2].toDouble()

    val sp = 0.5*(side1 + side2 + side3)

    val square = sp*(sp-side1)*(sp-side2)*(sp-side3)

    val area = sqrt(square)
    println("Area = %.5f".format(area))
}