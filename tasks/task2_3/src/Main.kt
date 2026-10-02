// Task 2.3

fun main() {

    val myAge = 29u
    val universeAge = 13_800_000_000L
    val status = 'M'
    val name = "Sarah"
    val height = 1.78f
    val root2 = Math.sqrt(2.0)

    println(myAge::class)
    println(universeAge::class)
    println(status::class)
    println(name::class)
    println(height::class)
    println(root2::class)

    println("myAge type: ${myAge::class}")
    println("universeAge type: ${universeAge::class}")
    println("status type: ${status::class}")
    println("name type: ${name::class}")
    println("height type: ${height::class}")
    println("root2 type: ${root2::class}")

    println("myAge: $myAge")

    //just checking exercise 2.3
    val pi: Double = 3.14159
    println("$pi")
}
