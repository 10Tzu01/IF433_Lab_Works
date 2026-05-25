package oop_105327_Nicholas.week14

data class User(val name: String, val email : String, val age: Int)

class UserManager{
    fun validateUser(user: User): Boolean {
        return user.email.contains("@") && user.age >= 18
    }

    fun saveUserToDatebase(user: User) {
        println("INSERT INTO user VALUES ('${user.name}', '${user.email}')")
    }

    fun sendWelcomeEmail(user: User) {
        println("Sending email to:  ${user.name}")
    }
}