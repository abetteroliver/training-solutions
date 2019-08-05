package com.wirecard.examples

import java.lang.IllegalArgumentException
import kotlin.properties.Delegates

class Foo {
    // Add a delegate that only sets name that are no longer than 5 characters and throws an exception otherwise. Hint: Veto
    var name by Delegates.vetoable("Foo") {property, oldValue, newValue ->
        if (newValue.length <= 5) true else throw IllegalArgumentException("Illegal value $newValue")
    }

    // Add a delegate that prints the old and the new value every time the value changes. Hint: Observable
    var size by Delegates.observable(1) {property, oldValue, newValue ->
        println("Old value: $oldValue, new value: $newValue")
    };
}

fun main(args: Array<String>) {
    val foo = Foo()

    foo.size = 3 //prints Old value: 1, new value: 3

    foo.name = "Oliver" //throws exception
}


