// Task 12.9: demo program for class implementing Static Factory Method

import kotlinx.datetime.LocalDate

fun main() {
    val date = LocalDate(1997, 8, 23)
    val date2 = LocalDate(1999, 7, 23)
    //val p1 = Person("Glorp", date)
    val p = Person.create("Samson",date)
    //val p2 = Person.create("Samson",date2) -- runtime error
}