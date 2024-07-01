class Car(carBrand: String) {

    var isTurnedOn = false
    var brand: String = carBrand


    fun startEngine(){
        if(isTurnedOn){
            println("Car is already turned on")
        }else{
            println("VROOM VROOM Car started")
            isTurnedOn = true

        }

    }
    fun stopEngine(){
        if(isTurnedOn){
            println("Car turned off")

            isTurnedOn = false
        }else{

            println("engine is already turned off")
        }

    }
    fun drive(){
        if(isTurnedOn){
            println("Car has started moving")
        }else{
            println("start the engine first")
        }

    }
}