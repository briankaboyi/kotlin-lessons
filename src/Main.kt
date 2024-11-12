import Strings.StringFunctions

fun main() {
    val stringFunctions: StringFunctions = StringFunctions()
    val word: String = stringFunctions.word
    val sentence: String = stringFunctions.sentence

//    BASIC STRING FUNCTIONS
    //LENGTH
    println("LENGTH ${stringFunctions.word.length}")
    println(stringFunctions.sentence.length) //.length  checks the length of the string.counts the spaces as characters
    //IS EMPTY
    println("IS EMPTY ${stringFunctions.word.isEmpty()}")  //checks if its an empty string and returns a boolean TRUE
    // IS BLANK
    println("IS BLANK ${stringFunctions.word.isBlank()}")  //checks if only contains whitespaces and returns a boolean TRUE
    // IS NOT EMPTY
    println("IS NOT EMPTY ${stringFunctions.word.isNotEmpty()}")  //checks if its not empty and returns a boolean TRUE
    // IS NOT BLANK
    println("IS NOT BLANK ${stringFunctions.word.isNotBlank()}")  //checks if its not Blank and returns a boolean TRUE



}


fun weatherReport(city: String, lowTemp: Int, highTemp: Int, rainPosibility: Int): Unit {
    println("City: $city")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $rainPosibility%")
    println()
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun generate(phrase: String): String {
    val phraseList = phrase.replace("-", " ").replace("_", "").split(" ")
    var firstLetters = mutableListOf<String>()
    for (i in phraseList) {
        println(i)
    }
    println(phraseList)
    for (i in phraseList) {
        val wordLetters = if (i.isNotEmpty()) i.split("").filter { it.isNotEmpty() } else continue
        firstLetters.add(wordLetters[0])
    }
    return firstLetters.joinToString(separator = "").uppercase()
}