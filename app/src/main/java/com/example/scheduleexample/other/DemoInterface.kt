package com.example.scheduleexample.other

interface DemoInterface {
    val person: ArrayList<Person>

    val getPerson: ArrayList<Person>
        get() = person

    val sampleMessage: String
        get() = "This is a message."

}