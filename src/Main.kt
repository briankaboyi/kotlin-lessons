import DataTypes.Datatypes
import Variables.Variables

fun main(){
//expressions consist of variables, operators that evaluate to a single value
    val total: Int = (1..500).random() + 200
    val numberCheck = if (total> 500) "More than 500" else "Less than 500"

    println("nummberCheck $numberCheck")
    print("total $total")

    // A statement is everything that makes up a complete unit of execution
    println("Hello mate")

    val quickMaths = 2 + 2 + 1
    println(quickMaths)


    //A block is a group of statements (zero or more) that is enclosed in curly braces { }
    var number = 0

    for (i in 1..25){
        number += 1
        print("$number ")
    }
    // for single line comments
    /*
    * for block/multiline comments
    * */
}