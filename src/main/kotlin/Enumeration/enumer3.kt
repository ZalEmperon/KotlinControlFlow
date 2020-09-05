package Enumeration

fun main() {
    val color: Color = Color.valueOf("RED")
    print("color is $color")
}

enum class cOlor(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}