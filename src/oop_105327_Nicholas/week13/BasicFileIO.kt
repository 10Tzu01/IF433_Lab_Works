package oop_105327_Nicholas.week13
import java.io.File

fun main(){
    println("=== Test Write text ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem. \n")
    println("File berhasil dibuat dan ditulis.")

    file.appendText("Line 2: Menambahkan konfigurasi baru. \n")
    println("Teks berhasil di-append.")

    println("\n=== Test Read Text ===")
    val fullContent = file.readText()
    println("Membaca sekaligus:\n$fullContent")

    println("=== Test Read Lines ===")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->
        println("Isi Index $index : $line")

    }

    println("\n=== Test safe resource handling ===")
    val safeFile = File("safe_logs.txt")

    safeFile.printWriter().use { out ->
        for (i in 1..100){
            out.println("Safe log entry #$i: System status OK.")
    }
    }
    println("100 baris log berhasil di-generate dengan sangat aman.")

    println("\n=== Test Buffered Reader ===")
    safeFile.bufferedReader().use { reader ->
        reader.lineSequence(). take(5).forEach { line ->
            println("Stream Read: $line")
        }
    }
}

