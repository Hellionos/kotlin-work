// Task 12.4.1: Circle class

import kotlin.math.PI
//import kotlin.math.hypot

class Circle(val centre: Point, val radius: Double) {
    init {
        require(radius>0) { "radius needs to be bigger then zero "}
    }
    fun area() = PI*(radius*radius)
    fun perimeter() = 2*PI*radius
    fun contains(p: Point): Boolean = (p.distanceTo(centre) <= radius)
}