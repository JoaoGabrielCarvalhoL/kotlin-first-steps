package staticc.kotlin

interface Event {
    fun some()
}


class Anonymous {
    fun someMethod(event: Event) {
        println("Some method")
        event.some()
    }
}

/**
 * Example of anonymous class.
 * */
fun main() {
    val anonymous: Anonymous = Anonymous()
    anonymous.someMethod(object : Event {
        override fun some() {
            TODO("Not yet implemented")
        }

    })
}