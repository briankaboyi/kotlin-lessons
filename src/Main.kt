import DataTypes.Datatypes
import Variables.Variables
import java.util.*

fun main(){
    print("enter some text")
    val stringInput = readLine()!!
    println("you entered this text: $stringInput")

    try {
        println("enter a number")
        val input = readln()//used for simple inputs that are expected to exist
        print("you entered number $input")
    }catch (e: Exception){
        println(e)
    }

    try{
        val digit = Scanner(System.`in`)
        println("Enter a number : ")
        val input = digit.nextInt()
        println(input)

    }catch(e: Exception){
        println("$e")
    }

}