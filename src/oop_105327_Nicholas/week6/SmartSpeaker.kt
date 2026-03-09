package oop_105327_Nicholas.week6

class SmartSpeaker(
    override val id: String,
    override val name: String,
) : SmartDevice, Switchable{
    override fun turnOn(){
        println("Smart Speaker $name aktif")
    }

    override fun turnOff(){
        println("Smart speaker $name standby")
    }

    fun playMusic(song; String){
        println("Play lagu $song dari Spotify")
    }
}