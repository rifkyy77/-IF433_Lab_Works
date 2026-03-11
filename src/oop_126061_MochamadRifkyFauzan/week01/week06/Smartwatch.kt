package oop_126061_MochamadRifkyFauzan.week01.week06

// Menggabungkan 1 Parent class dan 2 Interface
class Smartwatch : Watch(), BluetoothConnectable, Rechargeable{
    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di Sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}