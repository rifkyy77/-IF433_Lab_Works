package oop_126061_MochamadRifkyFauzan.week01.week06

// Fungsi ini Decoupled! Tidak Peduli kelas aslinya apa
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
            method.pay(amount) // Dynamic polymorphism in action
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    val lamp = SmartLamp("L01", "Lampu Ruang Tamu")

    lamp.turnOn()
    lamp.turnOff()

    val speaker = SmartSpeaker("SP01", "Google Nest")

    speaker.turnOn()
    speaker.playMusic("Perfect - Ed Sheeran")
    speaker.turnOff()
}