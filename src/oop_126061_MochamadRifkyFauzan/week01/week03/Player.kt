package oop_126061_MochamadRifkyFauzan.week01.week03

class Player(val username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("XP yang ditambahkan harus positif!")
            return
        }

        val levelLama = level
        xp += amount

        if (level > levelLama) {
            println("Level Up! Selamat $username naik ke level $level")
        }
    }
}