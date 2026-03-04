package oop_126061_MochamadRifkyFauzan.week01.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    // WAJIB di ovveride karena fungsi bekerja() bersifat abstract di parent
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    // fungsi unik/spesifik yang hanya dimiliki dosen
    fun mengejar() {
        println("[$nama] sedang mengajar mahasiswa di kelas")
    }
}