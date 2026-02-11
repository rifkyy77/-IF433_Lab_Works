package oop_126061_MochamadRifkyFauzan.week01.week02

class Student ( val name: String, val nim: String, val major: String, ){
    init {
        // validasi sederhana: cek panjang NIM
        if (nim.length !=5) {
            println("WARNING: Objektercipta dengan NIM ($nim) yang tidak valid!")
            println("Data Mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("Log: objek tudent $name berhasil dialokasikan di memory.")
        }
    }
}