package oop_105327_Nicholas.week2.tugaspersonal2

import kotlin.random.Random

fun main() {
    print("Hero Name: ")
    val name = readLine()!!

    print("Base damage: ")
    val baseDamage = readLine()!!.toInt()

    val hero = hero(name, baseDamage)

    var enemyHp = 100


    while (hero.isAlive() && enemyHp > 0) {
        println("\n1. Attack\n2. Run")
        when (readLine()!!.toInt()) {
            1 -> {
                hero.attack("Enemy")
                enemyHp = (enemyHp - hero.baseDamage).coerceAtLeast(0)

                if (enemyHp > 0) {
                    hero.takedamage(Random.nextInt(10, 21))
                }

                println("Hero HP: ${hero.hp} | Enemy HP: $enemyHp")
            }

            2 -> break
        }
    }

    println(if (hero.hp > 0 && enemyHp <= 0) "win" else "lose")
}
