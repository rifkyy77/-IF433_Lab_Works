package oop_126061_MochamadRifkyFauzan.week01

fun main(args: Array<String>) {
    // Variable definition
    var radius: Double = 7.0
    var pi: Double = 3.14
    // Calculation
    var area: Double = pi * radius * radius
// Output Concatena
    println("Radius: " + radius + ", Area: " + area)
    // Logic check
    checkSize(area)
}
fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}
