package oop_126061_MochamadRifkyFauzan.week01.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalvehicle = vehicle(brand = "sepeda onthel")
    generalvehicle.honk()
    generalvehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car( brand = "Toyota", number0fDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}