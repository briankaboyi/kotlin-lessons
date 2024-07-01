class Person {
    var age: Int= 0
        get(){
            println("getter has been accessed")
            return field
        }
        set(value){
            field = when{
                value < 18 -> 18
                value in 18..30-> value
                else ->  value -3
            }
            println("age has been set")
        }
    var actualAge: Int = 0


}