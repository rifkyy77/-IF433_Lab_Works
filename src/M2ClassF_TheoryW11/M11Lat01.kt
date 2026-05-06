package M2ClassF_TheoryW11

//function biasa
fun panggil_nama(nama: String) : String {
    return "Hai $nama";
}

//function extension function - Basic
fun String.panggil_mahasiswa() : String {
    var hasil = this.split("").joinToString(""){
        it.replaceFirstChar{
                c -> c.uppercase()
        }
    }
    return hasil;
}

//function extension - paramater
fun Int.tentukanLulus(nama:String) : String {
    var keputusan = "";
    if(this >= 70) {
        keputusan = "Lulus"
    } else {
        keputusan = "Remedial"
    }
    return "Mahasiswa $nama hasil keputusan adalah $keputusan";
}

//function extension - cek null
fun String?.cekNulldanEmpty():String {
    if (this == null || this.isEmpty()) {
        return "gak boleh null atau kosong bang"
    } else {
        return "username kamu adalah $this"
    }
}

//SCOPE - APPLY
class Mahasiswa() {
    var nim : String = "";
    var nama : String = "";
    var ipk : Int = 0;
}

fun main() {
    //cara panggil function extension - cek null
    var inputUsername: String? = null
    println(inputUsername.cekNulldanEmpty())

    //cara panggil function extension - parameter
    println(80.tentukanLulus("Revan"));

    //cara panggil function - biasa
    println(panggil_nama("Toni").uppercase());

    //cara manggil function extension - basic
    println("Tonyy".panggil_mahasiswa());

    //SCOPE - LET
    var kampusSaya = "UMN";
    kampusSaya.let {
        if (it == "UMN") {
            println("kampus" + it + "keren")
        } else {
            println("Amazing $it")
        }
    }

    //SCOPE - RUN
    var alamatSaya = "Gading Serpong";
    alamatSaya.run {
        println("Saya tinggal di " + this)
    }

    //SCOPE - WITH
    var gradeSaya = with(90) {
        if (this >= 80 ) {
            "A"
        } else if (this >= 70) {
            "B"
        } else {
            "C"
        }
    }
    println("Grade kamu adalah $gradeSaya");

    // SCOPE - APPLY
    var dataMahasiswa = Mahasiswa().apply {
        nim = "123456";
        nama = "yudi";
        ipk = 3;
    }
    println("Mahasiswa ${dataMahasiswa.nama} dengan nim ${dataMahasiswa.nim} ipk nya ${dataMahasiswa.ipk}");

    //SCOPE - ALSO
    var deretAngka = mutableListOf<Int>(80,70,75,68,85);
    deretAngka.also {
        println("Sebelum $deretAngka");
    }.add(90)
    println("Setelah $deretAngka");

}