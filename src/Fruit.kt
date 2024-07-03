open class Fruit(_fruit: String) {
    val fruit = _fruit

    init {
        println("You chose a fruit $fruit")
    }

    //public by default, visible everywhere
    open fun sayHello() {
        println("$fruit says hello")
    }

    //private.only  visible within the class
    private fun helloPrivate() {
        println("$fruit says hello in private")
    }

    //protected same as private but also accessible by subclasses
    protected open fun helloProtected(_dummyText: String) {
        println("$fruit says hello in protected: $_dummyText")
    }
}

class SubFruit(_fruit: String) : Fruit(_fruit) {
    init {
        helloProtected("dummy")
    }


}