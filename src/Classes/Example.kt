package Classes

/**
 * A class is a blueprint for createing objects
 *
 * classes have a primary constructor defined in the header and a secondary constructor defined in the body
 *
 * the constructor keyword is optional if there are no visibility modifiers eg. (public ,private)
 */
class Example constructor(val name:String) {
    /**
     * declaring class properties using var generates getters and setters under the hood
     *
     * you can also create your own custom getter and setter for each property
     *
     * declaring class properties using val only generates getters seeing as val is read-only
     */
    var propertys1 : String = "property 1"
        set(value){field = value.trim()}
        get() = field.uppercase()

    val propertys2 : String = "property 2"
        get() = field.uppercase()

    /**
     * when you declare using private, getters and setters will be generated but can only be accessible only within the class
     */
    private val propertys3 : String = "property 3"

    fun printAllProperties(){
        println(" $propertys1")
        println(" $propertys2")
        println(" $propertys3")
        println("name = $name")
    }

}

data class Person(val name : String,val age : Int ){

    fun printProperties(){
        println("$age $name")
    }
}

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun comparePeople(): Boolean {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)
    println(p1.printProperties())
    return p1 == p2  // should be true
}
fun main(){
    val myExample = Example(name= "myProperty name")
    myExample.propertys1 = " some expample value "
    println(myExample.propertys1)
    println(myExample.propertys2)

    println(getPeople())
}

