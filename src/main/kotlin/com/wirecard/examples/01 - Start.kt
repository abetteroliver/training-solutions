package com.wirecard.examples

import java.time.LocalDate

fun main(args: Array<String>) {
    // Create a function that checks if a date is inside a valid range of days of year. Try to use a range
     val date = LocalDate.of(2019, 8, 5)
     println(isInRange(date, 100, 200)) //prints false

    // Prefix all numbers with "Day " and print them
     listOf(1,2,3)
             .map {"Day $it"}
             .forEach(::println)
}

fun isInRange(date: LocalDate, startDay: Int, endDay: Int) = date.dayOfMonth in startDay..endDay

