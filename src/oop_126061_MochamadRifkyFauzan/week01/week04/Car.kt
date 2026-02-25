package oop_126061_MochamadRifkyFauzan.week01.week04

// car is-a vehicle paramater brand dilempar ke atas melalui vehicle(brand)
open class Car(brand: String,val number0fDoors: Int) : vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $number0fDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

}
