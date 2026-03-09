package oop_105327_Nicholas.week6

class SmartCCTV (
    override val id: String,
    override val name : String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV $name On")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name off ")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV $name mulai rekam ke lokal")
    }

}