package oop_105327_Nicholas.week13
import java.io.File

fun main(){
    println("=== Test Unsafe resource Handling ===")
    val unsafeFile = File("unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    writer.close()
    println("process penulisan unsafe selesai")
}