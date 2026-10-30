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
            throw IllegalArgumentException("Cents can't be greater than 99")
        }
    }
    operator fun plus(other: Money) =
        Money(
        euros + other.euros + (cents + other.cents) / 100,
        (cents + other.cents) % 100
    )

    operator fun minus(other: Money) =
        if (cents >= other.cents) {
            Money(
                euros - other.euros,
                cents - other.cents
            )
        } else {
            Money(
                euros - other.euros -1,
                cents + 100 -other.cents
            )
        }

    override fun toString() = "(€$euros.$cent)"
    }

fun main() {
    val m1 = Money(5,40)
    val m2 = Money(2,70)
    val mplusm = m1.plus(m2)
    println(m1)
}
