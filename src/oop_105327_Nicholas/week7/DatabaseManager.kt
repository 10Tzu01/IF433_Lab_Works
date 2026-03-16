package oop_105327_Nicholas.week7

object DatabaseManager {
    var connectionStatus: String="Disconnected"

    fun connect(){
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}