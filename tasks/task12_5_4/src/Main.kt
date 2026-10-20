// Task 12.5.4: demo program for class with a computed property

import kotlinx.datetime.LocalDate


val date = LocalDate(2000, 8, 23)

fun main() {
    val p = Person("Fleetwood", date)
    println(p.age)
}