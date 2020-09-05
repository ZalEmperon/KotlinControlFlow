package Enumeration

fun main() {
    val color: Color = Color.GREEN

    print("Position GREEN is ${color.ordinal}")
}

enum class colOr(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}