// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean {
    val side1 = triangle.first
    val side2 = triangle.second
    val side3 = triangle.third
    if ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
        return true
    }
    return false
}

fun triangleArea(triangle: Triangle): Double {
    val side1 = triangle.first
    val side2 = triangle.second
    val side3 = triangle.third

    val sp = 0.5*(side1 + side2 + side3)

    val square = sp*(sp-side1)*(sp-side2)*(sp-side3)

    val area = sqrt(square)

    return area
}
