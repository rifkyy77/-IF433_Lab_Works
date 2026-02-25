package oop_126061_MochamadRifkyFauzan.week01.week04

// car is-a vehicle paramater brand dilempar ke atas melalui vehicle(brand)
open class Car(brand: String,val numberOfDoors: Int) : vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate() // memanggill logika penambahan kecepatan milik parent
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan")
    }

}
