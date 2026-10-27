// Task 15.2.3: SavingsAccount class

class SavingsAccount(holder: String, val rate: Double): BankAccount(holder) {
    init {
        require(rate > 0) {
            throw IllegalArgumentException("Interest rate needs to be greater than 0")
        }
    }
    fun applyInterest() = deposit((balance*rate/100).toInt())
}