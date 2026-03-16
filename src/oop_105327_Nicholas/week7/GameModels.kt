package oop_105327_Nicholas.week7

enum class ItemRarity (val dropChance: Int) {
    COMMON(70),
    UNCOMMON(70),
    RARE(70),
    EPIC(70),
    LEGENDARY(70)
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)