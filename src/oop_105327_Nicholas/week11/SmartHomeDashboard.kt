package oop_105327_Nicholas.week11

import oop_105327_Nicholas.week1.printreceipt

fun main(){
    val homeDevice = mutableListOf<SmartDevice>()

    SmartDevice("Philips Wiz Living Room", "Lighting").apply{
        isOnline = true
        powerLoad = 12
    }.also{
        homeDevice.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera")
        .apply{
            isOnline = true
            powerLoad = 12
        }
        .also{
            println("(Log) Kamera terhubung")
            homeDevice.add(it)
        }
}