// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    init {
        require((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA) {
            throw IllegalArgumentException("One of the sides of the triangle is too large for this to be valid")
        }
    }
    val perimeter get() = sideA + sideB + sideC
    val semiPerimeter get() = (sideA + sideB + sideC)/2
    val area get() = sqrt((0.5*(sideA + sideB + sideC))*((0.5*(sideA + sideB + sideC))-sideA)*((0.5*(sideA + sideB + sideC))-sideB)*((0.5*(sideA + sideB + sideC))-sideC))

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}