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
}