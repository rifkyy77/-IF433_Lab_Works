package oop_126061_MochamadRifkyFauzan.week01.week06

class SmartHomeHub {

    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("${device.name} berhasil ditambahkan ke Smart Home.")
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}