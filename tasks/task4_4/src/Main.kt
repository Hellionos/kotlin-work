// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size !=3) {
        println("Error: 3 tempertature settings not been input")
        exitProcess(1)
    }
    val initial = args[0].toDouble()
    val max = args[1].toDouble()
    val inc = args[2].toDouble()
    var current = initial
    println("----------------------------------")
    while (current < max) {
        var fah = current*1.8 + 32
        println("|%.1f° Celcius || %.1f° Fahrenheit|".format(current, fah))
        current += inc
    }
    println("----------------------------------")
}
//°