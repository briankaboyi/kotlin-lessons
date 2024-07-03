class OuterClass {
    val apple = "Apple"
    val number = 25

    class NestedClass {
        fun printMessage(message: String) {
            println(message)
            //you cant access apple or number directly within nested class. you might have to pass outerclass implicitly to access its properties
        }
    }

    inner class InnerClass {
        fun printMessage(message: String) {

            println("$apple $number $message from inner class")
        }
    }
}