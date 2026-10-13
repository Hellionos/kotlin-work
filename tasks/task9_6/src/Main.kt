// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess


fun main(args: Array<String>) {
    try {
        println("The Variance of the dataset is %.5f".format(variance(readData(args[0]))))
    }
    catch (error: NumberFormatException) {
        println("Numbers should be exclusively used in the file")
        exitProcess(1)
    }
    catch (error: IllegalStateException) {
        println("Trying to access an element that does not exist")
        exitProcess(1)
    }
    catch (error: Exception) {
        println("Some kinda error here my guy")
        exitProcess(1)
    }

}
