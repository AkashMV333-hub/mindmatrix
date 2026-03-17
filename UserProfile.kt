data class User(
    val name: String,
    val age: Int,
    val email: String
)

fun printAvatar() {
    println("+-----------+")
    println("|  (•‿•)    |")
    println("|  Avatar   |")
    println("+-----------+")
}

fun displayProfile(user: User) {
    println("\n----- User Profile -----")
    printAvatar()
    println("Name  : ${user.name}")
    println("Age   : ${user.age}")
    println("Email : ${user.email}")
    println("------------------------")
}

fun main() {

    val users = listOf(
        User("Akash", 21, "akash@email.com"),
        User("Rahul", 22, "rahul@email.com"),
        User("Anita", 20, "anita@email.com")
    )

    for (user in users) {
        displayProfile(user)
    }
}