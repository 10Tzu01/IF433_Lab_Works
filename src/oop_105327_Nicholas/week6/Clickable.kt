package oop_105327_Nicholas.week6

interface Clickable{
    val name: String

    fun click()
}

class Butto(override val name : String) : Clickable{
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}