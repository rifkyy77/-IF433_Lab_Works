package M2ClassF_TheoryW8

class Alamat(val nomor:Int, val kota:String)
class Mahasiswa(val nim:String, val addr: Alamat?);

fun main() {
    val almt = Alamat(47, "Tangerang");
    val mhs = Mahasiswa("12345", almt);

    val defaultAlamat = mhs.addr?.let {
        alamatAsli -> "Sini nih.. ${mhs.addr.kota} nmornya ${mhs.addr.nomor}";
    }?:"Gak jelas, gatau dimana";


    println("Nim nya ${mhs.nim} tinggalnya di ${defaultAlamat}");
}