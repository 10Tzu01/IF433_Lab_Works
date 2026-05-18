package oop_105327_Nicholas.week13
import java.io.File

fun main(){
    println("=== Test Write text ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem. \n")
    println("File berhasil dibuat dan ditulis.")

    file.appendText("Line 2: Menambahkan konfigurasi baru. \n")
    println("Teks berhasil di-append.")
}

