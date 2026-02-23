package oop_105327_Nicholas.week4

open class Car(brand : String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk(){
        println("Bagai mobil $brand denagn $numberOfDoors pintu dibuka")
    }

    override fun honk(){
        println("Tin Tin! Mobil $brand lewat!")
    }

    override fun accelerate(){
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}