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

    // panggil di dalam main()
    println("Status: ${calculateStatus(score)}")

    //tambah diakhir main()
    val studentId: String? = null

    // jika null, gunakan nilai result 0
    val idLength =  studentId?.length ?: 0
    println("Panjang ID: $studentId")
}

//Tulis DI LUAR main()
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"