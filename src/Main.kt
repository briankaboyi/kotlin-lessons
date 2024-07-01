
fun main(){
  add(1)
}
var b = 1
fun add(a: Int): Int{
     b = a
    if(b<5){
        println("still in recursion :value of b id $b")
        add(a+1)

    }else{
        println("recursion done: value of b : $b")

    }
    return b
}