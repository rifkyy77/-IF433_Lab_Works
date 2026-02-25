package M2ClassF_TheoryW4

class Sushi: makanan() {
    var jenis:String = "";
    fun sushi_terjual(jns:String, jml:Int) {
        this.jenis = jns;
        harga= jml * 100;
        println("Sushi $jenis laku $harga");
    }
}