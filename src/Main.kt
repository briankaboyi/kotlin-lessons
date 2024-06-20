import DataTypes.Datatypes
import Variables.Variables
import java.util.*

fun main(){
    print("enter some text")
    val stringInput = readLine()!!
    println("you entered this text: $stringInput")

    try {
        println("enter a number")
        val input = readln()//used for simple inputs that are expected to exist: can be any type since non is specified
        print("you entered number $input")
    }catch (e: Exception){
        println(e)
    }

    try{
        val digit = Scanner(System.`in`)
        println("Enter a number : ")
        val input = digit.nextInt() //only type specified is allowed else it will throw an error
        println(input)

    }catch(e: Exception){
        println("$e")
    }
}