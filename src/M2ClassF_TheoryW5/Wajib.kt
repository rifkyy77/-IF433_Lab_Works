package M2ClassF_TheoryW5

class Wajib: Matakuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "OOP";
        println("matkul ${super.nama} sks $sks");
    }
    fun ada_seminar() {
        println("wajib ada seminar");
    }
}