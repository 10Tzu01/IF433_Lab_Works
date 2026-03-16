package oop_105327_Nicholas.week7

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}! Bersiap bertarung!")
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Loot didapat: $name | Damage: $damage | Rarity: $rarity")
        }

        is BattleState.GameOver -> {
            println("GAME OVER! Penyebab: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Kamu berada di Safe Zone. Aman untuk sementara.")
        }
    }
}