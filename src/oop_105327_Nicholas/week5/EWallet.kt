package oop_105327_Nicholas.week5

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName)  {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] E-wallet payment $amount success, Remaining = $balance")
        }else{
            println("[$accountName] Not enough money lol $amount")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top Up successful. Remaining = $balance")
    }
}