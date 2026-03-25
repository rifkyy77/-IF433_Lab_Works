package oop_126061_MochamadRifkyFauzan.week01.week07

sealed class BattleState {

    // Ketemu monster
    data class MonsterEncounter(val monsterName: String) : BattleState()

    // Dapet loot
    data class LootDropped(val item: GameItem) : BattleState()

    // Game over
    data class GameOver(val reason: String) : BattleState()

    // Zona aman (tanpa data)
    object SafeZone : BattleState()
}