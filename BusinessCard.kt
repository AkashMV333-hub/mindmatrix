fun printLogo() {
    println("****************************")
    println("*      MY COMPANY 🚀       *")
    println("****************************")
}

fun printHeader(name: String, role: String) {
    println("\n$name")
    println(role)
    println("----------------------------")
}

fun printContact(phone: String, email: String, website: String) {
    println("📞 Phone   : $phone")
    println("📧 Email   : $email")
    println("🌐 Website : $website")
    println("----------------------------")
}

fun main() {

    printLogo()

    printHeader(
        name = "Akash M.V",
        role = "Android Developer"
    )

    printContact(
        phone = "+91 9876543210",
        email = "akash@email.com",
        website = "www.akashdev.com"
    )
}