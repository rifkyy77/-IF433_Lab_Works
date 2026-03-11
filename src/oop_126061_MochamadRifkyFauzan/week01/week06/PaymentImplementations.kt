package oop_126061_MochamadRifkyFauzan.week01.week06

class Gopay : PaymentMethod {
    override fun pay (amount: Double) { println("Processing Rp$amount via Gopay Server") }
}

class CreditCard : PaymentMethod {
    override fun pay (amount: Double) { println("contacting bank for Rp$amount") }
}