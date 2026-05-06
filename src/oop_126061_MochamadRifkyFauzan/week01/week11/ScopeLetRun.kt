package oop_126061_MochamadRifkyFauzan.week01.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    //mengeksekusi blok hanya jika objek tidak null
    val length = name?.let {
        println("Nama terdeteksi: $it") // 'it' merujuk pada name
        it.length //mengembalikan nilai expression terakhir
    }

    println("Panjang nama: $length")
}