// Task 5.2.1: main program

fun main(args: Array<String>) {
    val rad = args[0].toDouble()
    val area = circleArea(rad)
    val perim = circlePerimeter(rad)
    println("The area of the circle is %.4f and the perimeter is %.4f".format(area, perim))
}