package M2ClassF_TheoryW4

class pasta: makanan() {
    private var toping:String="";
    public fun pasta_terjual(jml:Int) {
        this.toping="nara";
        super.harga = jml *120;
        println("pasta $toping laris $harga");
    }
    override public fun jual_makanan() {
        println("saya jual PASTA enak");
    }
}