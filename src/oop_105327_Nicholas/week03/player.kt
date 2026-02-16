package oop_105327_Nicholas.week03

class player (val username : String) {
    private var xp: Int = 0

    val level : Int
        get()=(xp/100) +1

    fun addXp(amount : Int) {
        if(amount <= 0){
            println("XP amount must be above 0")
            return
        }

        val oldLevel = level
        xp += amount
        val newLevel = level
        if(newLevel > oldLevel){
            println("Level Up! Wow took you long enough ${username}!")
        }
    }
}