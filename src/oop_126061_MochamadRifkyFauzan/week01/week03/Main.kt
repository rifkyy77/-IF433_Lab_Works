package oop_126061_MochamadRifkyFauzan.week01.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000// harusnya print error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("pajak yang harus dibayar: ${e.tax}")
}