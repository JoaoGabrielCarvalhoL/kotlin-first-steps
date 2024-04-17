package heritage

import java.util.*
import kotlin.random.Random

/**
 * The class needs to be open to allow other classes to inherit it
 * */
open class Electronic(protected var manufacturer: String) {

    private var isActive: Boolean = false
    private lateinit var runtime: String
    private lateinit var version: String
    private val locale: Locale = Locale.getDefault()

    private fun electricCurrent(): Unit {
        if (!this::runtime.isInitialized && !this::version.isInitialized) {
           this.runtime = Runtime.getRuntime().toString()
            this.version = Runtime.version().toString()
        }
        val randomAccess: Int = Random.nextInt(-1, 1)
        this.isActive = randomAccess == 0
    }

    fun on(): Unit {
        electricCurrent()
        if (!isActive) throw RuntimeException("Electrical current has not been initialized.")
        println("Runtime Active: $runtime. Version: $version. Locale: $locale")
    }

    /**
     * Must be open for overriding
     * */
    open fun off(status: Int): Unit {
        println("Off!")
    }
}