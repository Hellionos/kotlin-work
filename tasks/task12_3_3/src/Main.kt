// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate
fun main() {
    val date = LocalDate(1997, 8, 23)
    val stringdate1 = ("1997-08-23")
    val p1 = Person("", stringdate1)
    println("${p1.name}, ${p1.birth}, ${p1.isMarried}")

    val stringdate2 = ("2001-01-21")
    val p2 = Person("               ", stringdate2)
    println("${p2.name}, ${p2.birth}, ${p2.isMarried}")
}