package oop_105327_Nicholas.week4

fun main(){
    println("---Testing vehicle---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n---Testing Car---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()


    println("\n---Testing Electric Car---")
    val myEv = ElectricCar(brand = "Wuling", numberOfDoors = 2, batteryCapacity = 85)
    myEv.openTrunk()
    myEv.honk()
    myEv.accelerate()

}