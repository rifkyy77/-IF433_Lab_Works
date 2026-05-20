package M2ClassF_TheoryW13

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

data class Mahasiswa(val nim: String, val nama:String, val nilai: Int) {

}

fun main() {
    println("=== cara1 - Baca isi file ===")
    val file1 = File("src/M2ClassF_TheoryW13/contohfile.txt")
    val isiContent = file1.readText();
    println(isiContent);

    println("=== cara2 - Baca isi file ===")
    val contentSaya =  file1.readLines();
    contentSaya.forEach {
        println(it)
    }

    println("=== cara3 - Baca isi file - Buffered Reader ===")
    val file2 = BufferedReader (FileReader("src/M2ClassF_TheoryW13/contohfile.txt"))
    var isiFile: String? = file2.readLine();
    while(isiFile != null) {
        println(isiFile);
        isiFile = file2.readLine();
    }
    file2.close();

    println("=== cara4 - Baca isi file - Buffered Reader(Var.USE) ===")
    val file3 = File("src/M2ClassF_TheoryW13/contohfile.txt").bufferedReader();
    file3.use {
        it.lineSequence()
            .filter { it.isNotBlank() }
            .forEach { println(it) }
    }

    println("=== cara1 - Buat file ===")
    val fileSaya = File("src/M2ClassF_TheoryW13/contohfile.txt");
    fileSaya.writeText("Saya suka ke pasar\nBeli buah dan sayuran")

    fileSaya.appendText("\nuntuk ayah dan ibu\ndan kaka dan adik")

    val listBelanjaan = listOf("Ayam, Pisang, Beras");
    fileSaya.appendText(listBelanjaan.joinToString ("\n"));

    fileSaya.printWriter().use {
        it.println("saya kuliah di UMN")
        it.println("UMN kampus keren")
        it.println("saya jurusan IT")
    }
}