package oop_126061_MochamadRifkyFauzan.week01

fun main(args: Array<String>) {
    // Variable definition
    val radius = 7.0
    val pi = 3.14

    // Calculation
    val area = pi * radius * radius

    // Output
    println("Radius: $radius, Area: $area")
    println(checkSize(area))
}

// Expression Body Function
fun checkSize(area: Double) =
    if (area > 100) "This is a Big Circle"
    else "This is a Small Circle"