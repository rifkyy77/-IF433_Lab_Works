package M2ClassF_TheoryW6

class Mahasiswa(override val namaOrg: String,
                override val budgetRapat: Int,
                override val jmlOrg: Int,
                override val namaMK: String,
                override val nilaiMK: Int
) : Organisasi, KelasMK {
    override fun rapat() {
        println("Sedang rapat di $namaOrg");
        println("Biaya konsumsi rapat: ${super.biayaKonsumsi}");
    }

    override fun penilaian() {
        println("Nilai $namaMK adalah $nilaiMK");
    }

    override fun keaktifan() {
        super<KelasMK>.keaktifan();
        super<Organisasi>.keaktifan();
    }
}