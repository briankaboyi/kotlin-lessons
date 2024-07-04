
fun main() {
val str = "String"
    val strLength = str.let {it.length} //could be easily done with str.length but just here for demostration of let
    println("str length is $strLength")
    val a = 10
    var b = 4

    val sum = (a+2).let { val i = it + 3; i }.let { it * 2 }
    println(sum)
}

