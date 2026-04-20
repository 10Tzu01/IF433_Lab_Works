package oop_105327_Nicholas.week9

fun main(){
    println("=== Test List ===")

    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Multable List: $scores")
}