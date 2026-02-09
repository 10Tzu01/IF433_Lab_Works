package oop_105327_Nicholas.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- Aplikasi PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan Nim: (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if(nim.length !=5){
        println("Error: Pendaftaran dibatalkan. NIM harun 5 karakter!")

    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
}