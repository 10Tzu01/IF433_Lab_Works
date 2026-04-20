package oop_105327_Nicholas.week9

fun main(){
    println("===Test Lambda ===")
    val sumLambda = { a: Int, b: Int -> a+ b}
    println("Hasil Sum: ${sumLambda(5, 10)}")

    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil square: ${squareImplicit(4)}")
}