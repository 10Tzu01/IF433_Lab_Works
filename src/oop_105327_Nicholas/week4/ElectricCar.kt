package oop_105327_Nicholas.week4

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {
    final override fun accelerate() {
        println("$brand accelerate smoothly. Battery Capacity: $batteryCapacity%")
    }

}