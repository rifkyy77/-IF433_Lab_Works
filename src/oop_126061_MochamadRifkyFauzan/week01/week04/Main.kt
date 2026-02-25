package oop_126061_MochamadRifkyFauzan.week01.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalvehicle = vehicle( "sepeda onthel")
    generalvehicle.honk()
    generalvehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(  "Toyota",  4)
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

    println("\n--- Testing Employee Hierarchy ---")

    val manager = Manager(
        name = "Budi",
        baseSalary = 8000000
    )

    val developer = Developer(
        name = "Andi",
        baseSalary = 7000000,
        programmingLanguage = "Kotlin"
    )

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}