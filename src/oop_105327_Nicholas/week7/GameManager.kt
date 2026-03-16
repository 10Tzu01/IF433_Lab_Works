package oop_105327_Nicholas.week7

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame(){
        if(isGameRunning){
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        }else{
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}