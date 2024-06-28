
fun main(){
   doSomething()
    println(add(3,2,3,message="a different message"))
}

fun doSomething(){
    println("something done")
}

private fun add(a:Int,b:Int,c:Int,message:String = "this is a message"):Int{
    println(message)
    return a+b+c
}