package M2ClassF_TheoryW5

class Elective: Matakuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "VR Programming";
        println("Elektif ${super.nama} sks $sks")
    }
    fun ada_praktek() {
        println("wajib di praktekin");
    }

}