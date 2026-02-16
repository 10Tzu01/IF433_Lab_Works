package oop_105327_Nicholas.week2.tugaspersonal2

class hero (
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(target: String) =
        println("$name attack $target!")

    fun takedamage (dmg: Int){
        hp = (hp - dmg). coerceAtLeast(0)
    }

    fun isAlive() = hp > 0
}