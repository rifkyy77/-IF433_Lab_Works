package oop_126061_MochamadRifkyFauzan.week01.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // rantai safe calls yang elegan
    val destination =  emptyOrder.deliveryDetails?.address?.city?.name ?: "kota tidak diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        //blok ini hanya jalan jika totalprice tidak null
        val tax = price * 0.11
        "transaksi valid, harga: Rp$price, pajak: Rp$tax"
    } ?: "transaksi invalid: harga belum di set!"
    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for(item in mixedData) {
        val text = item as? String

        // hanya cetak jika cast sukses (text tidak null)
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100 // tipe aslinya integer
    // coba cast ke string jika gagal(null). ganti dengan "unknown String"
    val safeString = someObject as? String ?: "Unknown string"
    println("Hasil cast + fallback: $safeString")

    println("\n=== TEST THE RED BUTTON (!!) ===")
    val toxicData: String? = null
    try {
        // Dangerous: memaksa compiler percaya data ini tidak null
        val length = toxicData!!.length
    } catch (e: NullPointerException) {
        println("Crash (NPE)! jangan gunakan !! secara sembarangan")
    }

    val apiResponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try{
        val token = requireNotNull(apiResponse["token"]) {
            "CRITICAL EXCEPTION: token otentikasi tidak ditemukan dari server!"
        }
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    println("\n=== TEST JAVA INTEROP ===")
    val javaResponse =  LegacyJavaAPI.FetchServerStatus()
    val statusLength = javaResponse!!.length
    println("status dari java: $javaResponse (Length: $statusLength)")
}