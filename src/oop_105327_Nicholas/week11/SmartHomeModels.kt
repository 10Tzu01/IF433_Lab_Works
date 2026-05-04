package oop_105327_Nicholas.week11

data class SmartDevice(var name: String, var category: String, var isOnline: Boolean = false, var powerLoad: Int = 0)

fun SmartDevice.diagnose(): String{
    return "[Diagnostik] $name | Kategori: $category | Status: ${ 
        if (isOnline) "Online" else "Offline"
    } | Daya: $powerLoad Watt"
}