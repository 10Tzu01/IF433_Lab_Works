package oop_105327_Nicholas.week4

open class Employee (val name: String, val baseSalary: Int){
    open fun work(){
        println("Employee $name is working.")
    }

    open fun calculateBonus(): Int{
        return (0.1 * baseSalary). toInt()
    }
}