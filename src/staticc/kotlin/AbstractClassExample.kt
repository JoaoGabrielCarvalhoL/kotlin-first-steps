package staticc.kotlin

abstract class AbstractClassExample(val some:String) {
    abstract fun some()
}

class SomeClass(some:String) : AbstractClassExample(some) {
    override fun some() {
        TODO("Not yet implemented")
    }
}