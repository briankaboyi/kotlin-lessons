import DataTypes.Datatypes
import Variables.Variables

fun main(){
//    Arithmetic Operators
    println("${Operators().firstNumber} + ${Operators().secondNumber} = ${Operators().firstNumber + Operators().secondNumber}" )
    println("${Operators().firstNumber} - ${Operators().secondNumber} = ${Operators().firstNumber - Operators().secondNumber}" )
    println("${Operators().firstNumber} / ${Operators().secondNumber} = ${Operators().firstNumber / Operators().secondNumber}" )
    println("${Operators().firstNumber} * ${Operators().secondNumber} = ${Operators().firstNumber * Operators().secondNumber}" )
    println("${Operators().firstNumber} % ${Operators().secondNumber} = ${Operators().firstNumber % Operators().secondNumber}" )

    println(Operators().text1 + Operators().text2 + Operators().text3)

//    Assignment Operators
    var total =0

    total += 5
    println(total)
    //prints 5

    total -= 3
    println(total)
    //prints 2

    total *= 5
    println(total)
    //prints 10

    total /= 2
    println(total)
    //prints 5

    total %= 3
    println(total)
    //prints 2

    --total
    println(total)
    //prints 1

    ++total
    println(total)
    //prints 2

    println(total++)
//    does the increment after printing: prints 2

    println(total)
//    prints 3

    println(++total)
//    does the increment before printing: prints 4

    println(total)
//    prints 4

    val isWorking = false

    if(!isWorking){
        println("Something's not Working")
    }

    //Comparison Operators
    var number = 10
    var biggerNumber = 12
    var randomNumber = (1..20).random()

    println("Random Number is: $randomNumber")

    var numbers = listOf(1,3,10,20)

    if(randomNumber in numbers){
        println("random number is in numbers")
    }

    if(randomNumber !in numbers){
        println("random number is not in numbers")
    }



    if(number > biggerNumber){
        println("number is more than biggerNumber")
    }
    if(number < biggerNumber){
        println("number is less than biggerNumber")
    }
    if(number >= biggerNumber){
        println("number is more than or equal to biggerNumber")
    }
    if(number <= biggerNumber){
        println("number is less than or equal to biggerNumber")
    }
    if(number != biggerNumber){
        println("number is not equal to biggerNumber")
    }
    if(number < biggerNumber && number < randomNumber){
        println("number is less than biggerNumber and number is less than randomNumber")
    }
    if(number < biggerNumber || number > randomNumber){
        println("number is less than biggerNumber or number is more than randomNumber")
    }
}