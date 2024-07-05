fun main(){
    val ivan = Person(7.6,"IVAN")
    ivan.apply {
        name = "ivan2"
        height = 4.3
    }
    println(ivan.name)
    println(ivan.height)

    val person2 = Person(7.3,"PPER")
    with(person2) {
        name = "uri"
        height = 6.3
        println(name)
        println(height)
        println(this.name)
    }
}

