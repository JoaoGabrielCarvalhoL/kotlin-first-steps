package heritage

import kotlin.system.exitProcess

/**
 * It is not necessary to redeclare the expected variables in the inherited class constructor.
 * */
class Computer(manufacturer: String): Electronic(manufacturer) {
    override fun off(status: Int): Unit {
        println("Exiting all process.")
        exitProcess(status);
    }
}

fun main() {
    val computer: Computer = Computer("Dell")
    try {
        computer.on()
    } catch (exception: RuntimeException) {
        computer.off(-1)
    }


}