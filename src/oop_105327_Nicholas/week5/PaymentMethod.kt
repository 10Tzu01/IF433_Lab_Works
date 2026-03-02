package oop_105327_Nicholas.week5

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}