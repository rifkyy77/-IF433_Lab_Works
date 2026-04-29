package oop_126061_MochamadRifkyFauzan.week01.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
    fun searchByName(name: String): List<T> {
        return items.filter {
            it.toString().contains(name, ignoreCase = true)
        }
    }
}