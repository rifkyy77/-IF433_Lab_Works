package oop_126061_MochamadRifkyFauzan.week01.week07

fun processEvent(event: BattleState) {

    val message = when (event) {

        is BattleState.MonsterEncounter -> {
            "Monster muncul: ${event.monsterName}"
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            "Loot didapat: $name (Damage: $damage, Rarity: $rarity)"
        }

        is BattleState.GameOver -> {
            "Game Over: ${event.reason}"
        }

        BattleState.SafeZone -> {
            "Player berada di Safe Zone."
        }
    }

    println(message)
}