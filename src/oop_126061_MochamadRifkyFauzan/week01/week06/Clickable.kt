package oop_126061_MochamadRifkyFauzan.week01.week06

interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    val name: String // Abstract Property, tidak ada nilai  default

    // Function without body (Implicitly Abstract)
    fun click()
}