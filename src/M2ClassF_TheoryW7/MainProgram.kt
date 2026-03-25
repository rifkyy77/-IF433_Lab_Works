package M2ClassF_TheoryW7

import M2ClassF_TheoryW5.Matakuliah

fun main() {
    println("server: ${Koneksi.LinkServer}");
    Koneksi.test_koneksi();

    Mahasiswa.nama = "udin";
    val na:Int = Mahasiswa.set_nilai( uts = 80, uas = 100);
    println("nilai ${Mahasiswa.nama} adalah $na");

    Mahasiswa.isi_nama_kampus(namaUniv = "umn");

    val dsn1= Dosen( "indah", "12334",2020);
    println(dsn1);
    val dsn2 = dsn1.copy ( "budi", "123");
    //cara ambil data satu  field aja
    println("mama dosen1: ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}");

    println("matkul fav saya:" + MataKuliah.OOP.name);
    println("Index matkul:" + MataKuliah.OOP.ordinal);
    MataKuliah.OOP.sks_matkul();

    for(matkul in MataKuliah.entries) {
        println("matkul:" + matkul );
        matkul.sks_matkul();
    }
}