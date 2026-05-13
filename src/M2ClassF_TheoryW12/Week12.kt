package M2ClassF_TheoryW12

//basic Exception -Trycatch
fun pembagian(pembilang:Int, penyebut:Int) {
    try {
        val hasilBagi = pembilang/penyebut;
        println("Hasil bagi: $hasilBagi");
    } catch (e: Exception) {
        println("Error dipembagian: ${e.message}")
    } finally {
        println("Selesai pembagian")
    }
}

//Exception - Expression - Tipe data
fun cek_tipe_data() {
    var angka:Int = try {
        Integer.parseInt("10");
    } catch (e: Exception) {
        println("ada err di cektipedata ${e.message}");
        111
    }
    println("angka kamu adalah ${angka}");
}

//throw
fun cek_saldo(saldoSaya:Int) {
    if(saldoSaya < 1000) {
        throw IllegalArgumentException("Saldo ${saldoSaya} tidak perlu bayar pajak")
    } else {
        println("Selamat kamu orang kaya");
    }
}

// custom exception
class CekNilaiKKM(val kkm:Int, val nilai:Int): Exception("Nilai $nilai berada dibawah kkm $kkm")

class input_nilai_siswa(val kkm:Int) {
    fun input_nilai( nilaiSiswa: Int) {
        if(nilaiSiswa < kkm) {
            throw CekNilaiKKM(kkm, nilaiSiswa);
        } else {
            println("kamu lulus, dengan nilai $nilaiSiswa");
        }
    }
}

//Multiple catch
fun contoh_multiple_catch(nilai:String) {
    try {
        val angka = Integer.parseInt( nilai)
        val hasil = angka/2;
        println("hasil nilainya $hasil");
        cek_saldo(100);
    } catch (e: NumberFormatException) {
        println("Error salah format ${e.message}");
    } catch (e: ArithmeticException) {
        println("Error kesalahan aritmatika ${e.message}");
    } catch (e: Exception) {
        println(" Error program : ${e.message}")
    }
}

sealed class ATMException(pesan: String): Exception(pesan);

class saldo_dibawah_nol(val saldoKamu: Int):
    ATMException("Masa saldo $saldoKamu minus")
class cek_jumlah_saldo(val saldoAwal:Int, val jajan:Int):
ATMException("Saldo tinggal $saldoAwal, kamu jajan $jajan, ga cukup bang")

fun mulai_jajan(saldoAwalKamu:Int, jajanKamu:Int):Int {
    if(jajanKamu > saldoAwalKamu) {
        throw cek_jumlah_saldo(saldoAwalKamu, jajanKamu);
    } else if (saldoAwalKamu<0) {
        throw saldo_dibawah_nol(saldoAwalKamu);
    } else {
        println("Transaksi berhasil!!");
    }
    return saldoAwalKamu - jajanKamu;
}

fun main() {
    runCatching { mulai_jajan(1000, 900) }
        .onSuccess { println("Transaksi sukses : $it") }
        .onFailure { println("Transaksi gagal : $it") }

    contoh_multiple_catch("60");

    //pangggil class custom exception
    val nsiswa = input_nilai_siswa (70);
    try {
        nsiswa.input_nilai(60)
    } catch (e: Exception) {
        println("Ada error saat input nilai: ${e.message}");
    }

    //Coba - Throw
    try {
        cek_saldo (900)
    } catch (e: Exception) {
        println("Error diThrow: ${e.message}")
    }

    //Exception - Expression
    cek_tipe_data();

    //Exception - Basic
    pembagian(10, 0);
}

