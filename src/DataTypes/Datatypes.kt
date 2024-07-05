package DataTypes

class Datatypes {
    var byteNumber: Byte = 10;
//    Byte 8 bits | -128 - 127
    var shortNumber: Short = 200;
//    short 16 bits: -32768 - 32767
    var intNumber: Int = 40000
//    Int 32 bits: 2147483648 - 2147683647
    var longNumber: Long = 4223372036854775807
//    Long 64 bit: -9223372036854775808 - 9223372036854775808
    var floatNumber: Float = 10.3f
//    Float 32 bit: 6 - 7 significant digits
    var doubleNumber: Double = 14.1415151515
//    Double 64 bit: 16 - 17 significant digits
    var letter: Char ='a'
//    Char 16 bit: UTF-16 (in most cases, this is one Unicode character, but it may bre just one half of a Unicode character)
    var isWorking: Boolean = false
//    Boolean 8 - bit: true or false
    var text: String = "this is a Kotlin tutorial"
//    String
}