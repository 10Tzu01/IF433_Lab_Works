package oop_105327_Nicholas.week8

class Notification {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")

    }

    fun processUser(user: UserProfile) {
        if (user.email != null){
            sendEmail(user.email!!)
        }else {
            println("User ${user.name} tidak memiliki  email.")
        }

    }    }