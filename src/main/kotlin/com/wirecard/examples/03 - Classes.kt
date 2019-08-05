package com.wirecard.examples

class Person(firstName: String, var lastName: String) {
    // Create a custom setter for firstName that cuts off names with more than 10 characters
    var firstName = firstName
        set(value) {
            field = value.take(10)
        }

    // Create a getter that returns the full name
    val fullName: String
        get() = "$firstName $lastName"

}

fun main(args: Array<String>) {
    val amadeus = Person("Wolfgang", "Mozart")
    println(amadeus.fullName)
    amadeus.firstName = "Wolfgang Amadeus"
    println(amadeus.fullName) //prints Wolfgang A Mozart
}
