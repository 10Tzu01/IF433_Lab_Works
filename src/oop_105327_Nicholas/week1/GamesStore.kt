package oop_105327_Nicholas.week1

fun main(){
    val gametitle = "Beat Saber"
    val price: Int = 350000
    val finalprice = calculatediscount(price)

    printreceipt(title = gametitle , finalprice = finalprice)


}


fun calculatediscount(price: Int): Int =
    return if (price>=200000){
        println("You get 10% discount")
    price - (price * 10 / 100)
}else{
    println("Original Price")
    price
    }

fun printreceipt(title: String, finalprice: Int){
    println("$title, $finalprice")
}



