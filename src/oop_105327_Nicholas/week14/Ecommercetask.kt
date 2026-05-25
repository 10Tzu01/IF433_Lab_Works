package oop_105327_Nicholas.week14

import java.io.File

class BadOrderProcessor {

    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {


        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP"     -> basePrice * 0.90 // Diskon 10%
            else      -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")


        file.appendText("$itemName,$finalPrice,$customerType\n")


        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}


interface OrderRepository{
    fun saveOrder(price: Double)
}

class CsvOrderRepository : OrderRepository{
    override fun saveOrder(price: Double){

        File("orders.csv")
            .bufferedWriter()
            .use { writer ->
                writer.append("Price: $price")
                writer.newLine()
            }
    }
}



interface NotificationService{
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService{
    override fun sendNotification(message: String){
        println("Email: $message")
    }
}



class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
){

    fun processOrder(price: Double){

        repo.saveOrder(price)

        notifier.sendNotification(
            "Order success"
        )
    }
}

