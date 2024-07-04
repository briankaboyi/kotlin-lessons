
fun main() {
//   //// LET
//    val str = "String"
//    val strLength = str.let {it.length} //could be easily done with str.length but just here for demostration of let
//    println("str length is $strLength")
//    val a = 10
//    var b = 4
//
//    val sum = (a+2).let { val i = it + 3; i }.let { it * 2 }
//    println(sum)

//    ////RUN
//    val sentence = run {
//        val sentence1 = "this is returned inside the run method"
//        println("this is executed inside the run method")
//        sentence1
//    }
//    println(sentence)

    val phrase: String? = null
    phrase?.let {println("phrase is $phrase")} ?: run {
        "this was printed because phrase is null"
    }

    println(phrase)
}

