package Variables

//class Nullable(var myName:String,var myNickName:String?=null)
class Nullable(var myName:String, var myNickName:String?= null) {

init {
    println("Nullable initiated with the name $myName and nickname $myNickName")
}


    constructor(newWord:String?) : this("newWord =null"){
        println("$newWord has been created" )


}
}

fun newExpressionBodyFunction(a:Int,b:Int) : Int = a + b
fun timesTwo(num :Int):Int{
    return num *2
}
fun introduce(name:String = "Last Name Doe",city: String = "An Unknown CIty"): String = "Hi im $name from $city"
fun timeTwoAsAnExpression(num :Int) : Int= num *2


fun main(){
 val newNullable = Nullable("brian",)
    println(newExpressionBodyFunction(b=4,a=7))
    println(timesTwo(num=4))
    println(introduce())
    println(introduce("brian"))
    println(introduce(city = "nairobi"))
    println("from times two as an expression body *** ${timeTwoAsAnExpression(num = 6)}")






}