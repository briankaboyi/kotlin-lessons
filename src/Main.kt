import DataTypes.Datatypes
import Variables.Variables
import java.util.*

fun main(){
//    print("Enter a number:")
//    val number = readLine()!!.toDouble()
//
//    print("Enter another number:")
//    val number2 = readLine()!!.toDouble()
//
//    print("Enter an operator + - * /: ")
//    val operator = readLine()!!
//
//    val result: String= when(operator) {
//        "+" -> "$number +  $number2 = ${number + number2}"
//        "-" -> "$number -  $number2 = ${number - number2}"
//        "*" -> "$number *  $number2 = ${number * number2}"
//        "/" -> "$number /  $number2 = ${number / number2}"
//        else -> "operator is not recognized"
//    }
//    println(result)

//    val a: Int =(1..100).random()
//    println(a)
//    when(a){
//        //checking within a range
//        in 1..50 -> println("$a is in the range 1 to 50")
//        in 51..100 -> println("$a is in the range 1 to 100")
//    }


    var number =4

    var x = if(number ==1){
       "hello"
    }else if(number==2){
         "goodbye"
    }else if(number==3){
         3
    }else{
        listOf(1,2,3,4,5)
    }




        when(x){

        is Int -> {
            when(x){
                1 -> println("hello")
                2 -> println("goodbye")
                else -> println("not 1 or 2, number is: $number")
            }

        }
        is String -> println("number is string :  $number")
        else -> println("number is neither int or string: $x")
    }
}