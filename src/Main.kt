import DataTypes.Datatypes
import Variables.Variables
import java.util.*

fun main(){
// var number = 1
//
//    while (number<=5){
//        println("line $number")
//        number++
//    };
//
//    do{
//        println("do while $number")
//        number--
//    }while(number >=1)

    var sum = 0
    var userInput: String

    println("instructions: \ntype in any whole number to add\ntype 0 to exit")

    do{
        print("Enter a number:")
        userInput = readLine()!!
        sum+=userInput.toInt()

    }while (userInput != "0")

    print("total = $sum")
}