import DataTypes.Datatypes
import Variables.Variables
import java.util.*

fun main(){
 val number = (-10..10).random()
    println("random number is $number")

    var result = if(number > 0){
         "number is positive"
    } else if(number < 0){
        "number is negative"
    } else {
        "number is zero"
    }
    println(result)

    val a = (1..12).random()
    val b = (1..12).random()

//    var largestNumber = if(a < b){
//        println("a is smaller:a $a : b $b")
//        b
//    } else{
//        println("b is smaller:a $a : b $b")
//        a
//    }
//
    var largestNumber = if(a < b) b  else a

    println("largestNumber: $largestNumber")
}