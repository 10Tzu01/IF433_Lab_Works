package oop_105327_Nicholas.week9

fun main(){
    println("=== Test List ===")

    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Multable List: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1,2,2,3,3,4)
    println("Unique Numbers (Set): $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("Active Users: $activeUsers")

    println("\n=== Test Map ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A"// value boleh duplikat, key tidak
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"]= 20
    inventory["Apples"] = 45
    println("Inventory: $inventory")
}