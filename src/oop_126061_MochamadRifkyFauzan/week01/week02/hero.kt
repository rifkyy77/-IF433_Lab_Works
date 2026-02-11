package oop_126061_MochamadRifkyFauzan.week01.week02

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