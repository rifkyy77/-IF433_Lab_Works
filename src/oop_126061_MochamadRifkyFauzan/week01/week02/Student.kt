package oop_126061_MochamadRifkyFauzan.week01.week02

class Student(
    val name: String,
    val nim: String,
    val major: String,
    val gpa: Double = 0.0
) {

    init {
        // validasi sederhana: cek panjang NIM
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data Mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("Log: objek student $name berhasil dialokasikan di memory.")
        }
    }

    // secondary constructor
    constructor(name: String, nim: String) : this(
        name,
        nim,
        "Non-Matriculated",
        0.0
    ) {
        println("LOG: Menggunakan constructor jalur utama (Tanpa Jurusan).")
    }
}