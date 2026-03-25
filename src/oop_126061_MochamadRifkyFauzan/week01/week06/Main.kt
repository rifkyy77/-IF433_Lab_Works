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

    println("\n=== TESTING SMART HOME DEVICES ===")

    val lamp = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("SP01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")

    lamp.turnOn()
    lamp.turnOff()

    speaker.turnOn()
    speaker.playMusic("Perfect - Ed Sheeran")
    speaker.turnOff()

    cctv.turnOn()
    cctv.turnOff()

    println("\n=== TESTING SMART HOME HUB ===")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\nMengaktifkan Security Mode...")
    hub.activateSecurityMode()

    println("\nMematikan semua perangkat Switchable...")
    hub.turnOffAllSwitches()

} 