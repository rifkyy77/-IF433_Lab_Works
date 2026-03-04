package oop_126061_MochamadRifkyFauzan.week01.week05

fun main() {
    val dosen1 = Dosen("pak alex", "0123456")
    val admin1 = Admin("bu siti")

    val daftarPegawa: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawa) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengejar()
            }
            is Admin -> {
                println("=> Terdeteksi sebgai Admin")
                pegawai.doAdminWork()
            }
        }
        println("---------------------")
    }

    val math = MathHelper()

    println("=== COMPILE TIME POLYMORPHISM ===")
    println("Luas Persegi: ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${math.hitungLuas(5, 3)}")
    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

    println("=== SISTEM PEMBAYARAN ===")

    val ewallet = EWallet("Rifky", 50000.0)
    val creditCard = CreditCard("Rifky", 100000.0)

    val payments: List<PaymentMethod> = listOf(ewallet, creditCard)

    for (payment in payments) {
        payment.processPayment(75000.0)
    }
}