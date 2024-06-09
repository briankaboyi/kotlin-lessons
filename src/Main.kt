import Variables.Variables

fun main(){

    Variables().item = "not a carrot"
    Variables().items = "not carrots"
    println(Variables().items)
    println(Variables().item)
    println(Variables().text)
}