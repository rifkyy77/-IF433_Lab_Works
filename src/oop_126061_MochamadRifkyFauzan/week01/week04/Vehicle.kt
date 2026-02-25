package oop_126061_MochamadRifkyFauzan.week01.week04

// Gunakan keyword 'open' agar class bisa diwariskan
open class vehicle(val brand: String) {
  var speed: Int = 0

    // method juga bersifat final secara defaul, gunakan 'open' agar bisa di override
    open fun accelerate() {
        speed += 10
        println("$brand melaju, kecepatan: $speed km/jam")
    }

    open fun honk() {
        println("beep beep!")
    }
}