package M2ClassF_TheoryW10

//code non generiC
class rumah(var alamat: Any)

//code generic
class kampus<T>(val alamat: T)

//code generic  Multi Parameter
class Komputer<T, V>(val merk:T, val barcode:V)

//code generic function
fun <T> Password(isiPass:T):T {
    return isiPass;
}

//code generic function Constraint
class Kalkulator<T: Number>(val a:T, val b:T) {
    fun tambah(): Int {
        return a.toInt() + b.toInt();
    }
    fun kurang(): Double {
        return a.toDouble() - b.toDouble();
    }
}

//code generic where
val daftarNilai = listOf(60,71,90,83,73,67,55,84,72)
fun <T> Penilaian(List: List<T>, kkm:T):List<T> where T: Comparable<T> {
    return List.filter { it >= kkm };
}


fun main() {
    println("===== GENERIC WHERE =====");
    val daftarNilai = listOf(60,71,90,83,73,67);
    println("Daftar Nilai:" + daftarNilai);
    val nilaiAtasKKM = Penilaian(daftarNilai, 70);
    println("Nilai Atas KKM: " + nilaiAtasKKM);

    println("===== GENERIC CONSTRAINT =====");
    val kalk =Kalkulator(10.52,20.347);
    println("penambahan ${kalk.a} ditambah ${kalk.b} : " + kalk.tambah());
    println("pengurangan ${kalk.a} dikurang ${kalk.b} : " + kalk.kurang());

    println("===== GENERIC FUNCTION =====");
    println("password kamu :" + Password ("BTCUSDT"));


    println("===== GENERIC MULTI PARAM =====");
    val komp = Komputer("Dell", "1111");
    println("Merk Komputer : " + komp.merk);
    println("Barcode Komputer : ${komp.barcode}");

    println("===== SAMPLE NON GENERIC =====");
    val rmh = rumah(200);
    val angkaRumah = rmh.alamat as Int
    println(angkaRumah + 50)

    println("===== SAMPLE GENERIC =====");
    val kmps = kampus(300);
    println(kmps.alamat + 50)
}