import kotlin.random.Random


fun main() {

    val number = Random.nextInt(100)
    val evenOrNull = number.takeIf { it % 2 == 0 }
    val oddOrNull = number.takeUnless { it % 2 == 0 }

    println("number $number")
    println("evenOrNull $evenOrNull oddOrNull $oddOrNull")


val str = "a normal string"
    val caps = str.takeIf { it.isNotEmpty() }?.toUpperCase()
    println(caps)
}

