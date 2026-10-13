// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess
const val CSV_FILENAME = "temps.csv"
fun main(args: Array<String>) {
    val dataset = fetchData(args[0])
    val lowest = dataset.minByOrNull{ it.second }
    val highest = dataset.maxByOrNull{ it.second }

    println(lowest)
    println(highest)
    val average = dataset.sumOf{ it.second } / dataset.size
    //println(averageTemp(dataset))
    println(average)
   
}


