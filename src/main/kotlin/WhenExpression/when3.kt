package WhenExpression

fun main() {
    val value = 7
    val StringOfValue = when (value){
        6 ->"value is 6"
        7 ->"value is 7"
        8 ->"value is 8"
        else ->"value cant be reached"
    }
    println(StringOfValue)
}