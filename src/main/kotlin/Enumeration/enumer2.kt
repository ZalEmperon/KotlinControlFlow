package Enumeration

fun main() {
    val Colors: Array<Color> = Color.values()
    Colors.forEach { color ->
        print(color)
    }
}
enum class color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}