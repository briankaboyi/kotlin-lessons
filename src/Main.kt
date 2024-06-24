import DataTypes.Datatypes
import Variables.Variables
import java.util.*

fun main(){
for (i in 1 until 5){ //prints 1 -4
    print(i)
}
    println("----------------\n")

    for (i in 1 .. 5){ //prints 1 -5
    print(i)
}
    println("\n----------------")

    for (i in 5 downTo 1){
        print(i)
    }
    println("\n----------------")
    for (i in 500 downTo 1 step 20){
        print(i)
    }
    println("\n----------------")

    for (i in 1 until 500 step 20){
        print(i)
    }

    val languages = listOf<String>("Ruby","Kotlin","Python","Java","Dart")
    for (i in languages){
        for(i in languages){
            println(i)
        }
    }

    val text = "Whatever text you want"
    for(i in text){
        print("$i.")
    }
}