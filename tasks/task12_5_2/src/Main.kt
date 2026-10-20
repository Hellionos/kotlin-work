// Task 12.5.2: demo program for class with custom getter

import kotlinx.datetime.LocalDate

val date = LocalDate(1997, 8, 23)
fun main() {
    val p = Person("BlondIe", date)
    println(p.name)
}