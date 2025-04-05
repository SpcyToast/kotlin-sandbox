// function defined with fun
fun main() {
    variableContent()
    println("")
    conditionalContent(input = 71)
    println("")
    arrayContent()
}

fun variableContent() {
    println("-- Start of Variables Output --")
    println("")
    // Kotlin is statically typed, type of variable cannot change
    // type is inferred val is used for constant variable or read only
    val firstName = "Spongebob"
    // use : to show type (primitive types include String, Int, Double, Boolean)
    val lastName: String = "Squarepants"
    // var is used for mutable values therefore it is read and write
    var weight: Int = 71
    var active: Boolean = true
    println("First name: $firstName, Last name: $lastName, weight: $weight, active: $active")
    // Reassigning values can be done by
    weight = 72
    active = false
    println("Updated")
    println("First name: $firstName, Last name: $lastName, weight: $weight, active: $active")
    // concatenation can be done by adding strings or by using a template as shown below
    val concat = "$firstName $lastName"
    // println used to output to the console
    println("Users full name is $concat")
    // strings are a sequence of characters, characters can be called like an array by variable[index]
    val seventh: Char = firstName[6]
    println("the seventh letter of $firstName is $seventh")
    // to get more of the string you can use substring
    // following code gets the characters 6-8 from first name string. the end value is not shown
    val substringEx: String = firstName.substring(6,9)
    println("the last 3 letters of $firstName are $substringEx")
    // can check for empty, null, or blank
    val emptiness: Boolean = lastName.isEmpty()
    println("is the last name empty: $emptiness")
    // can get length using .length
    val concatLength: Int = concat.length
    println("the length of the $firstName $lastName is $concatLength")
    println("")
    println("-- End of Variables Output --")
}

fun conditionalContent(input: Int){
    println("-- Start of Conditionals Output --")
    println("")
    // conditionals
    val score: Int = input
    // conditionals include value comparisons using < > <= >= == != or boolean values
    if (score >= 70){
        println("you passed!")
    } else {
        println("you failed")
    }
    println("")
    println("-- End of Conditionals Output --")
}

fun arrayContent() {
    println("-- Start of Array Output --")
    println("")
    // arrays contain values of the same type, types can be declared using listOF<Type> otherwise type is inferred
    // immutable lists are made using listOf
    val names = listOf("Anthony", "Benjamin", "Clayton")
    println(names[2] + " Carmine was the only surviving Carmine brother in the Gears of War Trilogy")
    println("")
    // mutable lists are made using mutableListOf
    val characters =  mutableListOf("Shepard", "Kaiden", "Jenkins")
    println("The current party consists of " + characters[0] + ", " + characters[1] + ", and " + characters[2])
    println(characters[2] + " was shot by Geth Drones and has died")
    // can remove from a mutable array using .remove()
    characters.remove("Jenkins")
    println("The current party consists of " + characters[0] + " and " + characters[1])
    println("The party encounters a lone survivor of the initial Geth attack and has invited them to join the party")
    // can add to a mutable array using .add()
    characters.add("Ashley")
    println("The current party consists of " + characters[0] + ", " + characters[1] + ", and " + characters[2])
    println("")
    println("-- End of Array Output --")
}