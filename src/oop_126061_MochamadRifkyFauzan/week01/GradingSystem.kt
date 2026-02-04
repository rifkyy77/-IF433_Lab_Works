package oop_126061_MochamadRifkyFauzan.week01

fun main() {
    // REFACTOR: Gunakan val dan hapus tipe data eksplisit
    val name = "jhon Thor"
    val score = 80

    // REFACTOR: String Template ($name)
    println("Nama: $name , Nilai: $score")

    // Tambahkan di bawah println
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
}