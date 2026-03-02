package oop_105327_Nicholas.week5

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if(usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] CreditCard successful with $amount . Limit used = $usedAmount")
        }else{
            println("[$accountName] CreditCard Denied . Overused ")
        }
    }
}