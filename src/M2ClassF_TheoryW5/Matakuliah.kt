package M2ClassF_TheoryW5

abstract class Matakuliah {
    var nama:String = "";

    abstract fun set_matkul(sks:Int);

    fun hasil_matkul() {
        println("matkul diminati");
    }
}