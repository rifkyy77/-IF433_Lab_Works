package M2ClassF_TheoryW4

open class makanan {
    private var namaResto: String = "";
    protected var harga:Int = 0;
    protected var stock: Int = 10;

    init {
        namaResto = "Steak 12";
        println("resto saya $namaResto");
    }

    open public fun jual_makanan() {
        println("saya jual makanan");

    }
}