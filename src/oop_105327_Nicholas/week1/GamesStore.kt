package oop_105327_Nicholas.week1

fun main(){
    val gametitle = "Beat Saber"
    val price = "350000"
    val finalprice = calculatediscount(price)
}


fun calculatediscount(price: Int): Int = if (price>=200000){
    price - (price * 10 / 100)
    println("You get 10% discount")
}



