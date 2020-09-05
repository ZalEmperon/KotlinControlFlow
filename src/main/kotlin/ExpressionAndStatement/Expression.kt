package ExpressionAndStatement

fun main() {
    val openSchool = 7
    val now = 8
    val school = if (now > openSchool) "School already open" else "School close"

    print(school)
}