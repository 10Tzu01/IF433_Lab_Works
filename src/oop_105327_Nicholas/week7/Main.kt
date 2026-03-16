package oop_105327_Nicholas.week7

fun main(){
    println("=== Test Singleton ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n===Test Companion object===")
    val client = NetworkClient.createClient()
    client.connect()
}