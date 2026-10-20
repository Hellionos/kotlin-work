// Task 12.4.1: main program

fun main() {
    val p = Point(2.0,3.0)
    val c = Circle(p,4.0)
    val pointcheck = Point(3.0,4.0)
    println(c.area())
    println(c.perimeter())
    println(c.contains(pointcheck))
}