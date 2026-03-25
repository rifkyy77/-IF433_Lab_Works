package oop_126061_MochamadRifkyFauzan.week01.week07

fun main() {
    println("=== TEST SINGLETON")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instalasi lewat Factory
    client.connect()
}
