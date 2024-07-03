
fun main(){
val outer = OuterClass()
    val inner = OuterClass.NestedClass()
    inner.printMessage("from nested class")

    val innerclass = outer.InnerClass()
    innerclass.printMessage("innerclass innerclass")
}
//internal visibility modifier only used in modules