package oop_105327_Nicholas.week7

import oop_105327_Nicholas.week6.Recordable

fun main(){
    println("=== Test Singleton ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n===Test Companion object===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n===Test Regular Class ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")
}