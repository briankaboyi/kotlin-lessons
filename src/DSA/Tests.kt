package DSA

fun main() {
    /** *CREATED a list of numbers
     * 1. filter function to get even numbers
     * 2. sum function to get the sum of even numbers
     * 3. for loop to print each number in the list
     */

    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    println(numbers)
    var evenNumbers =numbers.filter{it% 2 ==0}
    println(evenNumbers)
    println(evenNumbers.sum().toString() + " is the sum of even numbers")
    for(num in numbers){
        println("$num from numbers")
    }
}