package oop_105327_Nicholas.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")
    return TradeRecord(
        id     = parts[0].toInt(),
        symbol = parts[1],
        type   = parts[2],
        margin = parts[3].toDouble(),
        pnl    = parts[4].toDouble()
    )
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try{
        File(path).readLines().mapNotNull{fromCsvTrade(it) }
    }catch (e: FileNotFoundException){
        println("Error: File not found!")
        emptyList()
    }
}