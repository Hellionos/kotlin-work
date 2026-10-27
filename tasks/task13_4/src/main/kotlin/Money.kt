// Task 13.4: Money class

data class Money(val euros: Int, val cents: Int) {
    init {
        require(euros >= 0) {
            throw IllegalArgumentException("Euros can't be negative")
        }
        require(cents >= 0) {
            throw IllegalArgumentException("Cents can't be negative")
        }
        require(cents <= 99) {
            throw IllegalArgumentException("Cents cn't be greater than 99")
        }
    }
    operator fun plus(other: Money) =
        Money(
        euros + other.euros + (cents + other.cents) / 100,
        (cents + other.cents) % 100
    )
    override fun toString() = "(€$euros.$cent)"
    }

fun main() {
    val m = Money(5,40)
    println(m)
}
