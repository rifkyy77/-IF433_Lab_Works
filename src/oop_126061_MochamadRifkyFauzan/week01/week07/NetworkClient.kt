package oop_126061_MochamadRifkyFauzan.week01.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}