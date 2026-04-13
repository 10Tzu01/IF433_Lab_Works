package oop_105327_Nicholas.week8

fun main(){
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tunjuan Pengiriman : $destination")
    println("\n=== Test Let Block ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let {price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: RP$tax"
    } ?: "Transaksi Invalid: Harga belum di-set"

    println(receipt)

    println("\n=== Test Safe Casting===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )
}