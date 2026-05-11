package oop_105327_Nicholas.week12

class InsuffecientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount,  balance : $balance")