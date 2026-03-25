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

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1 // Destructuring Declaration
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik")

    println("\n=== TEST GAME MANAGER ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TEST RARITY ===")
    println("Legendary Drop Chance: ${ItemRarity.LEGENDARY.dropChance}")

    println("\n=== TEST GAME ITEM ===")
    val item = GameItem("Pedang Besi", 50, ItemRarity.RARE)
    println(item)

    println("\n=== TEST WEAPON FACTORY ===")

    val starter = Weapon.forgeStarterSword()
    println("Starter: ${starter.item.name}, Damage: ${starter.item.damage}, Durability: ${starter.durability}")

    val epic = Weapon.forgeEpicSword()
    println("Epic: ${epic.item.name}, Damage: ${epic.item.damage}, Durability: ${epic.durability}")

    println("\n=== TEST BATTLE STATE ===")

    val event1 = BattleState.MonsterEncounter("Goblin")
    val event2 = BattleState.LootDropped(GameItem("Pedang", 10, ItemRarity.COMMON))
    val event3 = BattleState.GameOver("HP habis")
    val event4 = BattleState.SafeZone

    println(event1)
    println(event2)
    println(event3)
    println(event4)

    println("\n=== TEST EVENT PROCESSOR ===")

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(GameItem("Pedang Baja", 30, ItemRarity.RARE)))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))

    // ERROR: 'WHEN' expression must be exhaustive
    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan Alert: ${response.message}"
        is ApiResponse.Loading -> "Tampilkan Spiner:"
    }
    println("\n=== SIMULASI GAME MANAGER ===")

    GameManager.startGame()
    GameManager.startGame()

    println("\n=== SIMULASI RARITY & FACTORY ===")

// 1. Ambil drop chance
    println("Legendary Drop Chance: ${ItemRarity.LEGENDARY.dropChance}")

// 2. Buat weapon dari factory
    val starterWeapon = Weapon.forgeStarterSword()

// 3. Tampilkan detail
    println("Weapon: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")
}
