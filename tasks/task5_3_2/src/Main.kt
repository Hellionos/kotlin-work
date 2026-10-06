// Task 5.3.2: main program

fun main(args: Array<String>) {
    //val roll1 = rollDice(12,2)
    //val roll2 = rollDice(20)
    //val roll3 = rollDice(4,20)
    //val roll4 = rollDice()
    val rolluser = args[0]
    val numberuser = rolluser.substringBefore(delimiter = "d").toInt()
    val sidesuser = rolluser.substringAfter(delimiter = "d").toInt()
    val rolluserout = rollDice(sidesuser,numberuser)
}