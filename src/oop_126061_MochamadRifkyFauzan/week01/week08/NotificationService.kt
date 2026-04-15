package oop_126061_MochamadRifkyFauzan.week01.week08

class NotificationService() {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        // send email user (user.email) // ini akan error: type mismatch

        if (user.email != null) {
            // SUCCESS VIA smart cast: compiler  tahu 'user.email' pasti tidak null di blok ini
            sendEmail(user.email)
        } else {
            println("user ${user.name} tidak memiliki email.")
        }
    }
}