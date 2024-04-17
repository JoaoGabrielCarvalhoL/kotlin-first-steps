package collections

data class Data(private val number: Int, private val value: Float) {
    public fun getNumber(): Int {
        return this.number
    }

    public fun getValue(): Float {
        return this.value
    }
}

fun main() {
    val list: MutableList<Data> = mutableListOf(
        Data(1, 100f), Data(2, 200f),
        Data(3, 300f), Data(4, 400f), Data(5, 500f), Data(6, 600f), Data(7, 700f),
        Data(8, 800f), Data(9, 900f), Data(10, 1000f)
    )

    list.filter { it.getNumber() % 2 == 0 }
        .forEach { println(it.getValue()) }

    list.map { it.getValue() }.average()


}