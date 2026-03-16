fun calculateGrade(mark: Int): String {
    return when {
        mark >= 90 -> "A"
        mark >= 75 -> "B"
        mark >= 60 -> "C"
        mark >= 50 -> "D"
        else -> "F"
    }
}

fun main() {

    val subjects = arrayOf("Maths", "Science", "English")
    val marks = IntArray(subjects.size)

    var total = 0

    println("Enter marks for subjects:")

    for (i in subjects.indices) {
        print("${subjects[i]}: ")
        marks[i] = readLine()!!.toInt()
        total += marks[i]
    }

    val average = total / subjects.size

    println("\n------ Student Performance Report ------")

    for (i in subjects.indices) {
        val grade = calculateGrade(marks[i])
        println("${subjects[i]} : ${marks[i]} marks -> Grade $grade")
    }

    println("Total Marks: $total")
    println("Average Marks: $average")

    if (average >= 50) {
        println("Result: PASS")
    } else {
        println("Result: FAIL")
    }
}