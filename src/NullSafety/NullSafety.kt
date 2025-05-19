package NullSafety

fun main(){
    println("Hello World from Null Safety")
    /** * Nullable types ,Safe call operator (?.) and Elvis operator (?:)
     *
     */
    var name: String? = "Brian" //? means that the variable can be null
    name = null
    var num: Int? = 10 //

    var length: Int? = name?.length //?.length means that if name is not null, get the length, otherwise return null ||
    length = name?.length ?: 0 //?: means that if name is null, return 0
    println("My name is $length") //length is null, so it will return 0
    var num2 :Int = num!!
    /** * ?.let
     * The let function is a scoping function that allows you to execute a block of code on an object if it is not null.
     * It returns the result of the block of code.
     * It is useful for executing multiple operations on a nullable object without having to check for null each time.
     */
    name?.let{
        println("My name isfrom let $it") //it is the name variable
    }
    println("My name after let $name")//it is the name variable
}
