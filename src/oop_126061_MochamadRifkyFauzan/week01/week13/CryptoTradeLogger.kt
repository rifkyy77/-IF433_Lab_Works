package oop_126061_MochamadRifkyFauzan.week01.week13

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String =
    "$id,$symbol,$type,$margin,$pnl"