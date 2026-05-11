package oop_105327_Nicholas.week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching{
        "42X".toInt()
    }
}