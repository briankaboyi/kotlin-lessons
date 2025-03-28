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
//!! //NOT NULL ASERTION


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
       println("printUpperCaseName: ${person.name.uppercase()}")
   }
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

    println("stringLenght: ${stringLength(null)}")
    println("stringLenght: ${stringLength("null")}")
    println("getAge: ${getAge(null)}")
    println("getAge: ${getAge(34)}")
   printUpperCaseName(Person("taiwan"))
printUpperCaseName(null)

}