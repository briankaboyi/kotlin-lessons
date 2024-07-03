
fun main(){
val fruit = AnotherFruit()
    println(fruit.sugar)
    println(fruit.writeSomething())
    println(fruit.fruit())
    fruit.fruitBanana()
    fruit.fruit()
}
class AnotherFruit: Banana,Apple {
    override val sugar: Int
        get() = 10

    override fun writeSomething(): String ="i am a string"
    override fun fruit() {
        super<Apple>.fruit()
    }
    fun fruitBanana(){
        super<Banana>.fruit()

    }
}