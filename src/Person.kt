open class Person(_height:Double,_name:String) {
    var height = _height
    var name = _name
    var applePrice: String = "$34"

//
    init{
        println("My height is $height")
        println("My name is $name")
    }
    open fun walk(){
        println("Walking is good for your health")
    }
}
class Teacher(_height: Double, _name: String,_topic : String): Person(_height,_name){

    val topic = _topic
    fun teach(){
        println("$name is teaching $topic")
    }
    override fun walk(){
    println("teacher $name has been walking")
    }
}
class Business(_height: Double, _name: String): Person(_height, _name){
    fun doBusiness(){
        println("$name is doing business")
        println("THe price of an apple is $applePrice")
    }

}