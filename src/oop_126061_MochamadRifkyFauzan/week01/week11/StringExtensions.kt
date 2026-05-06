package oop_126061_MochamadRifkyFauzan.week01.week11

// Extension function dengan receiver 'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}