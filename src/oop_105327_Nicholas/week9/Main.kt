package oop_105327_Nicholas.week9

fun main(){
    println("===Test Generic Class===")
    val inBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi inBox: ${inBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}