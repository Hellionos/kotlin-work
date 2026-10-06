// Task 4.2: use of if and ranges

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    println("PIZZA MENU\n")
    println("(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Veggie\n")
    println("Choose your pizza (a-d): ")
    val pizza = readln().lowercase()
    if (pizza[0] in 'a'..'d' && pizza.length == 1) {
        println("Order accepted")
        exitProcess(0)
    }
    else {
        println("Invalid choice")
    }
}
