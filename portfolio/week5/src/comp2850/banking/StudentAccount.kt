// COMP2850 Portfolio: Week 5
// StudentAccount class

package comp2850.banking
const val MAX_OVERDRAFT = 100

class StudentAccount(holder: String, _overdraft: Int=0): BankAccount(holder) {

    var overdraft: Int = _overdraft
        set(value) {
            require(value >= 0 && value <= 100) {
            throw IllegalArgumentException("Overdraft cannot be less than 0 or more than 100")
        }
        field = value
        }

    override fun withdraw(amount: Int) {
        require(amount > 0) { 
            throw IllegalArgumentException("Withdrawal amount must be greater than 0" )
            }
        require(amount <= (balance+overdraft)) {
            throw IllegalArgumentException("Insufficient funds for withdrawal")
        }
        balance -= amount
        }

    fun withdrawalsAllowed(): Boolean {
        return balance > -overdraft
    }

    override fun toString(): String = "Account for $holder, balance = $balance (overdraft = $overdraft)"

}
