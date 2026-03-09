package oop_105327_Nicholas.week6

class SmartHomeHub {

    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches(){
        println("\n Semua saklar mati")
        for(device in devices){
            if(device is Switchable){
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode(){
        println("\n Mode Aman")
        for(device in devices){
            if(device is Recordable){
                device.startRecord()
            }

            if(device is SmartSpeaker) {
                device.playMusic("Warning Sound SFX")
            }
        }
    }
}