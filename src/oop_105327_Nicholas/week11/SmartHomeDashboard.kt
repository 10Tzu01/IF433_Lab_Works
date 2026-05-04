package oop_105327_Nicholas.week11

fun main(){
    val homeDevice = mutableListOf<SmartDevice>()

    SmartDevice("Philips Wiz Living Room", "Lighting").apply{
        isOnline = true
        powerLoad = 12
    }.also{
        homeDevice.add(it)
    }
}