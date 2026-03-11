package M2ClassF_TheoryW6

fun main() {
    val mhs = Mahasiswa(
        namaOrg = "HMIF",
        budgetRapat = 15000,
        jmlOrg = 20,
        namaMK = "OOP",
        nilaiMK = 88);
    mhs.rapat();
    mhs.penilaian();
    mhs.keaktifan();
}