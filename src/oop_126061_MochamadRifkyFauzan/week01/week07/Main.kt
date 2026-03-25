package oop_126061_MochamadRifkyFauzan.week01.week07

fun main() {
    println("=== TEST SINGLETON")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instalasi lewat Factory
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 23)
    println(reg1) // Akan mencetak memori hash
    println("Sama? ${reg1 == reg2}") // false

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 23)
    val data2 = DataUser("Alice", 23)
    println(data1) // otomatis readable format
    println("sama? ${data1 == data2}") // True

}
