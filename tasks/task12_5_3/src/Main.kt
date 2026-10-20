// Task 12.5.3: demo program for class with custom setter

import kotlinx.datetime.LocalDate

val date = LocalDate(1997, 8, 23)
fun main() {
    val p = Person("Blondie", date)
    p.name = ""
    println(p.name)
}