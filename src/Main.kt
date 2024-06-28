import DataTypes.Datatypes
import Variables.Variables
import java.util.*

private var coinFlips = 0
private var headsWin = 0
private var tailsWin = 0
fun main(){
    println("How's the weather today?")
    println("Flip the coin how many times?")
val numberOfTimes =  readLine()!!.toInt()
    for(i in 0 until numberOfTimes){
        val random = (1..2).random()
        println("random $i: $random")
        ++coinFlips
        if(random == 1){
            headsWin++
            print("heads $headsWin")
        }else{
            tailsWin++
            print("tails $tailsWin")

        }
        println("Coins flipped: $coinFlips")
    }
    println("""
        Total flips = $coinFlips
        ---
        Heads won: $headsWin times
        ---
        Tails won: $tailsWin times
    """.trimIndent())
}