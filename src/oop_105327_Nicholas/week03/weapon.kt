package oop_105327_Nicholas.week03

class Weapon(val name: String) {

    private var _damage: Int = 0

    var damage: Int
        get() = _damage
        set(value) {
            when {
                value < 0 -> {
                    println("Warning: Damage cannot be negative. Value not changed.")
                }
                value > 1000 -> {
                    _damage = 1000
                }
                else -> {
                    _damage = value
                }
            }
        }


    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}
