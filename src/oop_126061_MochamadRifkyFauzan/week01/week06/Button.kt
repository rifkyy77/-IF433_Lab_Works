package oop_126061_MochamadRifkyFauzan.week01.week06

class Button (override val name: String): Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}