package oop_105327_Nicholas.week4

class Developer(name: String, baseSalary: Int, val programmingLanguage: String): Employee(name, baseSalary) {
    override fun work() {
        println("$name is coding with $programmingLanguage")
    }
}