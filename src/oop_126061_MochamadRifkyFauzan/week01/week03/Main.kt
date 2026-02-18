package oop_126061_MochamadRifkyFauzan.week01.week03

fun main() {
    val e = Employee("Budi")

    //1. test validasi salary
    e.salary = -1000// harusnya print error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    //2. test encapsulation
    e.increasePerformance()
    // 6. performancing

    // 3. test computed property
    println("pajak yang harus dibayar: ${e.tax}")
}