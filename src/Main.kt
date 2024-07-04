data class Cat(val name: String, val age: Int) {}

fun main() {
    val cats = listOf(
        Cat("john",12 ),
        Cat("james",14 ),
        Cat("peter",11 ),
        Cat("simon",15 ),
    )
    val oldersCat = cats.maxBy {it.age }
    println("${oldersCat.name} is the oldest cat")
    val helloWorld = { println("hello mate!") }
    helloWorld()

    val sum = { a: Int, b: Int -> a + b }
    println(sum(4, 5))
}
