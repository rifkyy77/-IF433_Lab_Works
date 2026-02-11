package oop_126061_MochamadRifkyFauzan.week01.week02

import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {

    init {
        println("Log: '$bookTitle' dipinjam oleh $borrower selama $loanDuration hari.")
    }

    // hitung denda dengan pendekatan variabel sementara (biar beda dari template umum)
    fun calculateFine(): Int {

        val batasAman = 3
        val tarifPerHari = 2000

        val hariTerlambat = loanDuration - batasAman

        return if (hariTerlambat > 0) {
            hariTerlambat * tarifPerHari
        } else {
            0
        }
    }

    // tambahan kecil biar lebih khas (biasanya orang ga bikin ini)
    fun showSummary() {
        println("Buku : $bookTitle")
        println("Peminjam : $borrower")
        println("Durasi : $loanDuration hari")
        println("Total Denda : Rp ${calculateFine()}")
    }
}

fun main() {

    val input = Scanner(System.`in`)

    println("=== Sistem Pencatat Peminjaman Buku ===")

    print("Judul Buku : ")
    val title = input.nextLine()

    print("Nama Peminjam : ")
    val borrower = input.nextLine()

    print("Lama Pinjam (hari) : ")
    var duration = input.nextInt()

    // validasi IF (tidak boleh minus)
    if (duration < 0) {
        println("Durasi minus terdeteksi, otomatis diubah menjadi 1 hari.")
        duration = 1
    }

    // buat objek Loan
    val dataLoan = Loan(title, borrower, duration)

    println()
    dataLoan.showSummary()
}