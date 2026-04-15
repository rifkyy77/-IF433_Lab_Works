package oop_126061_MochamadRifkyFauzan.week01.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // rantai safe calls yang elegan
    val destination =  emptyOrder.deliveryDetails?.address?.city?.name?: "kota tidak diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.totalPrice?.let { price ->
        //blok ini hanya jalan jika totalpriceidak null
        val tax = price * 0.11
        "transaksi valid, harga: Rp$price, pajak: Rp$tax"
    } ?: "transaksi invalid: harga belum di set!"
    println(receipt)
}