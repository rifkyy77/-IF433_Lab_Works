package oop_126061_MochamadRifkyFauzan.week01.week02

import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100     // default argument
) {

    init {
        println("Hero '$name' siap bertarung! HP awal = $hp | Damage = $baseDamage")
    }

    // simulasi menyerang
    fun attack(targetName: String) {
        println("$name menebas $targetName dengan kekuatan $baseDamage!")
    }

    // menerima damage
    fun takeDamage(damage: Int) {

        println("$name menerima $damage damage.")

        hp -= damage

        // wajib pakai IF → HP tidak boleh minus
        if (hp < 0) {
            hp = 0
        }

        println("HP $name sekarang: $hp")
    }

    // cek apakah masih hidup
    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {

    val input = Scanner(System.`in`)

    println("=== MINI TEXT BATTLE ===")

    print("Masukkan Nama Hero : ")
    val heroName = input.nextLine()

    print("Masukkan Base Damage : ")
    val dmg = input.nextInt()
    input.nextLine()

    // buat objek Hero
    val hero = Hero(heroName, dmg)

    // enemy hanya variabel bantu
    var enemyHp = 100

    println("\nMusuh muncul! HP Musuh = $enemyHp")

    // loop selama hero hidup dan musuh hidup
    while (hero.isAlive() && enemyHp > 0) {
        println("\n--- MENU ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = input.nextInt()
        input.nextLine()

        if (choice == 1) {

            // hero menyerang
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage

            if (enemyHp < 0) enemyHp = 0

            println("HP Musuh tersisa: $enemyHp")

            // musuh balas jika masih hidup
            if (enemyHp > 0) {

                val enemyDamage = (10..20).random()
                println("Musuh membalas!")

                hero.takeDamage(enemyDamage)
                println("HP Hero tersisa: ${hero.hp}")
            }
        } else if (choice == 2) {

            println("${hero.name} memilih kabur dari pertarungan!")
            break

        } else {
            println("Pilihan tidak valid.")
        }
    }

    // hasil akhir
    println("\n=== HASIL PERTARUNGAN ===")

    if (hero.isAlive() && enemyHp == 0) {
        println("${hero.name} MENANG! Musuh berhasil dikalahkan.")
    } else if (!hero.isAlive()) {
        println("${hero.name} KALAH... Hero tumbang.")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}