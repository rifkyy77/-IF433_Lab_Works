package M2ClassF_TheoryW8

fun main() {
    var nama: String? = "Susi";

    try {
        println("nama kamu ${nama!!.uppercase()}");
    } catch(ex: Exception) {
        println("errornya adalah ${ex.message}");
    }

    var dataMhs: List<Any> = listOf(123, "Wirawan", 89, "Tangerang");
    for(item in dataMhs) {
        var itemFilter = item as? String
        if (itemFilter != null) {
            println(itemFilter);
        }
    }
}