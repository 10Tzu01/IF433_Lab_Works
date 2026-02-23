package oop_105327_Nicholas.week4

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {
    override fun work(){
        println("$name is leading the division meeting")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}