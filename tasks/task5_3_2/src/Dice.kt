// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(sides: Int = 6, number: Int = 1) {
    var sum = 0
    for (x in 1..number) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        //println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        sum += result
        //println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
    }
    println("You rolled $sum from $number dice with $sides sides")

}