// function defined with fun
fun main() {
    // Kotlin is statically typed, type of variable cannot change
    // type is inferred val is used for constant variable or read only
    val firstName = "Spongebob"
    // use : to show type (primitive types include String, Int, Double, Boolean)
    val lastName: String = "Squarepants"
    // var is used for mutable values therefore it is read and write
    var weight: Int = 71
    var active: Boolean = true
    // concatenation can be done by adding strings or by using a template as shown below
    val concat = "$firstName $lastName"
    // println used to output to the console
    println(concat)
    // strings are a sequence of characters, characters can be called like an array by variable[index]
//    println(firstName[6])
    // can check for empty, null, or blank
    println(lastName.isEmpty())
    // can get length using .length
    println(concat.length)
}