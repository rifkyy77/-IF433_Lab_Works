package M2ClassF_TheoryW9

fun main() {
    println("======= List Of Imut =======")
    val arSiswa = listOf("budi", "danu", "susi", "cica");
    //view
    println(arSiswa);

    //panjang array
    println("banyak siswa: " + arSiswa.size);

    //munculin satu orang aja
    println("siswa bernama ${arSiswa[1]}");

    //for each--> munculin semua orang
    for (a in arSiswa) {
        print("siswa " + a + " dan ");
    }

    println("======= List Of Mutable =======")
    val arMatkul = mutableListOf("oop", "pemweb", "matdis", "kalkulus");
    arMatkul.add("Algo");
    arMatkul[2] = "Aljabar Linear"
    arMatkul.remove("pembweb");
    println(arMatkul);

    println("======= Set Of Imut =======")
    val arNilai = setOf(21, 23, 21, 66, 23, 89, 98, 18)
    println("banyak nilai" + arNilai.size);
    println("ada angka 23 ga? ${arNilai.contains(23)}");
    println(arNilai);

    println("======= Set Of Mutable =======")
    val arMahasiswa = mutableSetOf("andi", "yanto", "udin", "yudha");
    arMahasiswa.add("yanti");
    arMahasiswa.remove("udin");
    arMahasiswa.add("udin")
    println(arMahasiswa);

    println("======= MAP Imut =======")
    val arResto = mapOf(
        "ayam" to 5000,
        "Bakpao" to 3000,
        "Sayur Asem" to 2500
    );
    println("banyak menu ${arResto.size}");
    println("Harga ayam ${arResto["ayam"]}");
    println("List Makanan ${arResto.keys}");
    println("List Harga ${arResto.values}");
    println(arResto);


    println("======= MAP Mutable =======")
    val arKHS = mutableMapOf(
        "Toni" to 80,
        "Dika" to 85,
        "ara" to 87,
        "dapin" to 90
    );
    arKHS.remove("ara");
    arKHS["Dika"] = 92
    arKHS["cinta"] = 99
    println(arKHS);


    println("======= LAMBDA =======")
    //function biasa
    fun tambah(a: Int, b: Int): Int {
        return a + b;
    }
    println("hasil penambahan ${tambah(5, 3)}")

    //function lambda
    val kurang = { a: Int, b: Int -> a - b }
    println("Hasil pengurangan ${kurang(5, 3)}");

    println("======= Lambda { IT } =======")
    val pangkat = { a: Int, -> a * a }
    val hasilPangkat: (Int) -> Int = { it * it }
    println("Hasil pangkat ${hasilPangkat(5)}");

    println("======= FOREACH Biasa =======")
    for (a in arMatkul) {
        println(a);
    }

    println("======= FOREACH IT =======")
    arMatkul.forEach {
        println(it);
    }

    println("======= FOREACH VARIABLE =======")
    arMatkul.forEach { mk ->
        println(mk);
    }
}