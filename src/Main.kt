fun main() {

println(Numbers.APP_NAME)
    Numbers.helloMate()
    AnApple.randomNumber()
    val apple = AnApple()
    apple.fruit()
}
class AnApple{

    companion object{
        private var x = 0
        private var y = 30
        fun randomNumber(){

            val random = (x..y).random()
            println("random number is :$random")

        }
    }
    fun fruit(){
        x=50
        y=100
        randomNumber()
    }
}