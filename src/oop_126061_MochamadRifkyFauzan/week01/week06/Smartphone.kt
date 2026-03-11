package oop_126061_MochamadRifkyFauzan.week01.week06

// ERROR: Class Smartphone inherits multiple implementations of turnOn()
class Smartphone : Camera, Phone {
    // manually override to resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn() // menjalankan logika camera
        super<Phone>.turnOn()  // Menjalankan logika phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}