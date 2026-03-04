package oop_126061_MochamadRifkyFauzan.week01.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}