package oop_126061_MochamadRifkyFauzan.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 650000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) price * 20 / 100
    else price * 10 / 100

fun printReceipt(
    title: String,
    originalPrice: Int,
    finalPrice: Int
) {
    println("judul game   : $title")
    println("harga awal : Rp $originalPrice")
    println("harga akhir   : Rp $finalPrice")
}