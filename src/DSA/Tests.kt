package DSA

fun main() {
    /** *CREATED a list of numbers
     * 1. filter function to get even numbers
     * 2. sum function to get the sum of even numbers
     * 3. for loop to print each number in the list
     */
//
//    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    sumOfEvenNumbers(numbers)
//    println(numbers)
//    var evenNumbers = numbers.filter { it % 2 == 0 }
//    println(evenNumbers)
//    println(evenNumbers.sum().toString() + " is the sum of even numbers")
//    for (num in numbers) {
//        println("$num from numbers")
//    }

//***********************************************
//    maxOfTwo(10, 20)
//    println(maxOfTwo(10, 20).toString() + " is the max of two numbers")
//
//    println("printToN function called ${printToN(10)}")
//    mulitplicationTable(8)
//    println("the sum >>${recursiveSum(5)}")
    println("${evenInListOfIntegers(listOf(1, 2, 3, 9, 10))} is the number of even numbers in the list")
}

/** *A function that takes an array of integers, filters it and returns the sum of all even numbers
 *
 */

fun sumOfEvenNumbers(numbers: Array<Int>): Int {

    val filteredNumbers = numbers.filter { it % 2 == 0 }
    println("${filteredNumbers} result of numbers after filter")
    return filteredNumbers.sum()

}

fun maxOfTwo(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

/**
 * A function that takes an integer n and prints all numbers from 1 to n
 */

fun printToN(n: Int) {
    for (i in 1..n) {
        println(i)
    }
}

/**
 * A function that takes an integer n and prints the multiplication table of n
 */
fun mulitplicationTable(n: Int) {
    for (i in 1..10) {
        println("$n * $i = ${i * n}")
    }
}

fun recursiveSum(n: Int): Int {
    if (n > 0) {
        return n + recursiveSum(n - 1)
    } else {
        return 0
    }
}

fun evenInListOfIntegers(numbersList:List<Int>):Int {
//    return numbersList.filter { it % 2 == 0 }.size
    var evenNumbers= mutableListOf<Int>()

    for(i in numbersList){
        if(i % 2 == 0){
         evenNumbers.add(i)
//
        }
    }
    return evenNumbers.size
}


