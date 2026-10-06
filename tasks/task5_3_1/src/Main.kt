// Task 5.1.2: main program
import kotlin.system.exitProcess
fun main(args: Array<String>) {
    
    if (args.size == 0) {
            val rolluser = rollDie()
    }
    else if (args.size > 1) {
        println("Need a number for a the number of sides of the die")
        exitProcess(1)
    }
    else if (args.size == 1) {
        val rolluser = rollDie(args[0].toInt())
    }
    //val roll1 = rollDie(6)
    //val roll2 = rollDie(20)
    //val roll3 = rollDie(7)
}