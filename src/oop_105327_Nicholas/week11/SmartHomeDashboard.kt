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

    val acDevice = run{
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAX", false, 800)
    }

    homeDevice.add(acDevice)

    homeDevice.add(
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    )

    val searchResult = homeDevice.find{it.category == "Camera"}

    searchResult?.let{
        println(it.diagnose())
    }

    with(homeDevice){
        println("Total perangkat: ${this.size}")
    }

    val totalPower = homeDevice.run{
        sumOf {it.powerLoad}
    }

    println("Total days: $totalPower Watt")
}