package oop_105327_Nicholas.week2

class Student (
    val name: String,
    val nim: String,
    var major: String
){
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated"){
        println("Log: menggunakan contructor jalur umum (tanpa jurusan).")
    }

    init {
        if(nim.length != 5) {
            println("Warning: Object ercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungin akan bermasalah di sistem.")
        }else{
            print("Log: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }
}