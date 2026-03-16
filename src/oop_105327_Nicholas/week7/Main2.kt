package oop_105327_Nicholas.week7

fun Main2(){
    GameManager.startGame()
    GameManager.startGame()

    println()

    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal pemain:")
    println("Nama: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")

    println()

    val upgradedItem = starterWeapon.item.copy(
        name = "Pedang Kayu Bapuk +1",
        damage = 25
    )

    println("Setelah upgrade di Blacksmith:")
    println("Nama: ${upgradedItem.name}")
    println("Damage: ${upgradedItem.damage}")
    println("Rarity: ${upgradedItem.rarity}")

    println()


    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}