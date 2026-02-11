package M2ClassF_Theory

class pemain {
    var nama: String =  "Tidak Terdaftar" ;
    var speed: Int = 9;
    val shoot: Int = 8;

    init {
        nama = "Messi";
        println("ini adalah constructor");
    }

    constructor(alias:String="budi", kecepatan:Int=2) {
        nama = alias;
        speed = kecepatan;
        println("ini consctructor kedua");
    }

    fun bawa_bola() {
        println ("si $nama sedang bawa bola")
    }
}

fun main() {
    val player = pemain( alias = "Yoel", kecepatan = 100);
    player.bawa_bola();
    println("nama pemain: ${player.nama}");
    println("skill kecepatan: " + player.speed);

    val player2 = pemain ( alias = "ronaldo", kecepatan = 199);
    println("pemain populer: ${player2.nama}");
    println("kecepatan: " + player2.speed);
}