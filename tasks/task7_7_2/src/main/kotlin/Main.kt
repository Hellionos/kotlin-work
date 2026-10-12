// Task 7.7.2: phone book simulator
import kotlin.system.exitProcess
const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)
    val db = createDatabase()
    try {
        db.load(CSV_FILENAME)
    }
    catch (e: Exception) {
        println("File not found")
        exitProcess(0)
    }

    while(true) {
        println("Please enter a name from the phone book (Or quit)")
        val name = readln()
        if (name.lowercase() == "quit" ){
            break
        }
        if (name in db) {
            println("The phone number of ${name} is ${db[name]}")
        }
        else {
            println("Phone number not found. Please enter their number")
            val number = readln()
            db[name] = number
            db.save(CSV_FILENAME)
        }
    }



}
