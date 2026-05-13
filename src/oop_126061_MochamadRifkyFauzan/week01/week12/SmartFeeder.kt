package oop_126061_MochamadRifkyFauzan.week01.week12

fun dispenseKibble(
    requestedGram: Int,
    availableGram: Int,
    isJammed: Boolean
): Int {
    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }
    return availableGram

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    try {
        dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: DispenserJamException) {
        println("Error dispenser: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Error stok makanan: ${e.message}")
    } catch (e: Exception) {
        println("Terjadi error umum: ${e.message}")
    }

    finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    runCatching {
        dispenseKibble(
            requestedGram = 30,
            availableGram = 1000,
            isJammed = false
        )
    }
        .onSuccess { newStock ->
            currentKibbleStock = newStock
            println(
                "Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr"
            )
        }
        .onFailure { error ->
            println("Peringatan ke Pemilik: ${error.message}")
            println("(Opsional: Berikan chicken jerky secara manual)")
        }
}
