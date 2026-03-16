package oop_105327_Nicholas.week7

class NetworkClient private constructor(val url: String) {
    fun connect(){
        println("Connection to $url ...")
    }
}