abstract class AbstractPerson {
    val age = 89
    fun displayAge(age: Int){
        println("Age is $age")
    }
    abstract fun printMessage(message: String)
}
///cant instanciate an abstract class , you can only extend from it
class Coder(name:String): AbstractPerson(){
    override fun printMessage(message: String) {
       println("$age from abstrctclass and $message from override printMessage")
    }

}