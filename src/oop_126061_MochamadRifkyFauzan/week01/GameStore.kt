package oop_126061_MochamadRifkyFauzan.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 650000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) price * 20 / 100
    else price * 10 / 100