package M2ClassF_TheoryW7

enum class MataKuliah(val jmlsks: Int) {
    OOP(3),
    GAMEDEV(4),
    DASPRO(5);

    fun sks_matkul(){
        println("jml sksnya: $jmlsks");
    }

}