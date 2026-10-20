// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate
fun main() {
    val date = LocalDate(1997, 8, 23)
    val stringdate = ("1997-08-23")
    val p1 = Person("Glorp", stringdate)
    println("${p1.name}, ${p1.birth}, ${p1.isMarried}")
}