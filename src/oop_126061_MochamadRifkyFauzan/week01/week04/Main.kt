package oop_126061_MochamadRifkyFauzan.week01.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalvehicle = vehicle(brand = "sepeda onthel")
    generalvehicle.honk()
    generalvehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car( brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar(
        brand = "Tesla",
        numberOfDoors = 4,
        batteryCapacity = 85
    )
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
}