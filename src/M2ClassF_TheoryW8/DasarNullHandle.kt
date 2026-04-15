package M2ClassF_TheoryW8

class set_krs(val nim:String, val kodematkul:String?) {
    fun matkul_wajib(sks:Int?) {
        println("Matkul kamu $kodematkul sksnya $sks");
    }
}

fun main() {
    var nama:String? = "Wirawan";
    nama = null;
    println("Hai $nama");

    val settingKRS = set_krs("Nim","null");
    println("Nim kamu ${settingKRS.nim} matkul kamu ${settingKRS.kodematkul}");
    settingKRS.matkul_wajib(null);
}