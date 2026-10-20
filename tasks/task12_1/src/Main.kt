// Task 12.1: program that uses a Point object

fun main() {
    val p1 = Point(3.0,4.0)
    println("${p1.x}, ${p1.y}")
    println(p1.distance())
    val p2 = Point(4.5,7.0)
    println(p1.distanceTo(p2))
    
}
