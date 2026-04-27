package oop_105327_Nicholas.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 1000.0))
    val responce = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${responce.status}")

    responce.data.forEach{
        println("Name: ${it.name}, Balance: ${it.balance}")

    }
}