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
fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[", postfix = "]")
const val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2}\ $month \d{4}"""

//null safety and safe calls
fun sendMessageToClient(
    client: Client?, message: String?, mailer: Mailer
) {

    client?.let{
        message?.let{
            val personalInfo = client.personalInfo
            personalInfo?.let{
                val email = personalInfo.email;
                email?.let{
                    mailer.sendMessage(email, message);
                }
            }
        }
    }
}

//value?. value can be null  //SAFECALL OPERATOR
// nullValue ?: nonNullValue if its null return a non null value //ELVIS OPERATOR
//value?.let{} only execute if value is not null   //SAFE CALL WITH LET OPERATOR
//!! //NOT NULL ASERTION    forces value to be treated as nun-null


class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
class SimpleMailer : Mailer {
    override fun sendMessage(email: String, message: String) {
        println("Sending message to $email: $message")
    }
}
fun stringLength(myString :String?):Int{
    return myString?.length?:0
}
fun getAge(age:Int?):Int{
    return age?:18
}

class Person(val name: String)
fun printUpperCaseName(person : Person? ) {

   person?.let {
       println("printUpperCaseName: ${it.name.uppercase()}")
   }
}

fun sumList(myIntList : List<Int>?): Int{
    myIntList?.let {
        return it.sum()
    }
   return 0
}
fun getFullName(firstName:String?,lastName:String?): String{
    return if(firstName != null && lastName != null) "$firstName $lastName" else "Name Incomplete"
}

fun getArraySum( myAray : Array<Int>): Int{
    val numArrayLength =  myAray.size
    var total = 0
    myAray.forEach {
        if(myAray.indexOf(it)<=numArrayLength-1){
            total += it
        }
    }
    return  total
//    return myAray.sum()
}

fun reverseArray(myAray: Array<Int>):Array<Int>{
    return myAray.reversedArray()
}

fun findMissingNumber(myIntList: List<Int>):Int{
    var myValue = 1
    var missingInt = 0
    for(i in myIntList){
        println("this is i:$i and myvalue : $myValue")
        if(i!=myValue){
            missingInt = myValue
            println("i:$i is not equal to myvalue : $myValue")
            break
        }
        myValue++
    }
    return missingInt

}
fun rotatingList(myList: List<Any>, myIndex :Int):List<Any>{
    val listOne = myList.subList(myList.size - myIndex,myList.size)
    val listTwo = myList.subList(0,myList.size - myIndex)

    return listOne.plus(listTwo)

}

fun mergeSortedArrays(myArray1: Array<Int>,myArray2: Array<Int>):Array<Int>{
    val myFinalArra = arrayOf(*myArray1 , *myArray2)
    return myFinalArra
}

fun findTheLargestValud(myAray: Array<Int>):Int{
    var myInt = 0
    for(i in myAray){
        if(i>myInt){
            myInt = i
        }
    }
    return myInt
}
val sum:(Int,Int)->Int = {a,b->a+b}
/**
* (Int,Int) ->Int is the type of sum
* a,b  are parameters
* a+b is the return value
 */

fun checkEven(collection:List<Int>): Boolean  {
   return collection.any { it % 2 ==0 }
}


fun main(){
//    var newemail ="myemail@h.l"
//    var newPersonalInfo = PersonalInfo(email = newemail)
//    var newClient = Client(personalInfo = newPersonalInfo)
//    val mailer: Mailer = SimpleMailer()
//
// val newNullable = Nullable("brian",)
//    println(newExpressionBodyFunction(b=4,a=7))
//    println(timesTwo(num=4))
//    println(introduce())
//    println(introduce("brian"))
//    println(introduce(city = "nairobi"))
//    println("from times two as an expression body *** ${timeTwoAsAnExpression(num = 6)}")
//    println(joinOptions(listOf("a","B","C")))
//    println(getPattern())
//    println(sendMessageToClient(client = newClient,"this is message", mailer = mailer))

//    println("stringLenght: ${stringLength(null)}")
//    println("stringLenght: ${stringLength("null")}")
//
//    println("getAge: ${getAge(null)}")
//    println("getAge: ${getAge(34)}")
//
//    printUpperCaseName(Person("taiwan"))
//    printUpperCaseName(null)
//
//    val intList : List<Int> = listOf(1,2,3)
//    println("sumList >>${sumList(intList)}")
//    println("sumList >>${sumList(null)}") //throws a nullpointerexceptioni
//
//    println("getFullName >>${getFullName("john","doe")}")
//    println("getFullName >>${getFullName("john",null)}")
//    println("getFullName >>${getFullName(null,"doe")}")

    val numArray = IntArray(5) {it + 1}
    val numsArray = intArrayOf(1,23,2,45,5)
    val numsList = listOf(1,3,  5,9)
    println(numArray.contentToString())
    println(numsArray.contentToString())

    println(getArraySum(numsArray.toTypedArray()))
    println(reverseArray(numsArray.toTypedArray()).contentToString())
    println(findMissingNumber(numsList))
    println(rotatingList(numsList,4))
    println(mergeSortedArrays(numArray.toTypedArray(),numsArray.toTypedArray()).contentToString())


    println(sum(5,4))
    println(checkEven(numsList))
    println(findTheLargestValud(numsArray.toTypedArray()))



}