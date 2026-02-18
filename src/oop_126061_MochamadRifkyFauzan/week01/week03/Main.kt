package oop_126061_MochamadRifkyFauzan.week01.week03

fun main() {

    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("pajak yang harus dibayar: ${e.tax}")


    // ===== TEST WEAPON =====
    val w = Weapon("Excalibur", 300)
    w.damage = -50
    println("Damage sekarang: ${w.damage}")
    w.damage = 9999
    println("Damage sekarang: ${w.damage}")
    println("Tier senjata: ${w.tier}")

    // ===== TEST PLAYER =====
    val player = Player("Rifky")
    player.addXp(50)   // masih level 1
    println("Level sekarang: ${player.level}")
    player.addXp(60)   // total 110 -> harus Level Up ke 2
    println("Level sekarang: ${player.level}")
}