package M2ClassF_Theory

open class Bapake {
    private var nama: String = "Belum Tahu";
    private var umur: Int = 35;
    protected var gaji: Int = 1000;

    public var uangjajan :Int = 0
        set(value) {
            if (value < 0) {
                println("masa uang jajan 0 atau minus");
            } else {
                field = value;
            }
        }
        get() {
            return field + 123;
        }

    public fun set_nama(namabaru: String) {
        if(this.nama.length <= 0) {
            println("eh nama ga boleh kosong");
        } else {
            this.nama = namabaru;
        }
    }
    public fun get_nama(): String {
        return this.nama;
    }
}

class anake: Bapake() {
    fun dapatin_gaji_bapak():Int {
        this.gaji = 100
        return this.gaji + 100;
    }
}

fun main () {
    var ank = anake();
    ank.set_nama("Yanto");
    println("Nama papi kamu ${ank.get_nama()}");
    println("Gaji bapak : "+ ank.dapatin_gaji_bapak());

    ank.uangjajan = -100;
}