class CoffeeMachine(_coffeeInMachine: Boolean, _coffee: String){
    var coffeeInMachine = _coffeeInMachine
    var coffee = _coffee
    init{
        if(coffeeInMachine){
            println("Coffee machine has $coffee coffee in it")
        }
        else{
            println("Coffee machine has no coffee in it")
        }
        print("this is the init block")
    }
fun printMessge(){
    println("Coffee machine has $coffee")
}
}
