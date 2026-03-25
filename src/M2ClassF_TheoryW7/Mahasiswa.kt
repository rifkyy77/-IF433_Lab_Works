package M2ClassF_TheoryW7

class Mahasiswa private constructor(val kampus:String) {
    companion object {
        var nama: String = "unknown";

        fun set_nilai(uts: Int, uas: Int): Int {
            return (uts + uas) / 2
        }
        fun isi_nama_kampus(namaUniv:String) {
            Mahasiswa(  namaUniv)
        }
    }
    //Bagian yang class biasa (Bukan companion Object)
    init {
        println("nama kampus kamu $kampus")
    }
}