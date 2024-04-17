package collections

fun main() {
    val listOfNumbers: IntArray = IntArray(10)
    var index: Int = 0
    while(index < listOfNumbers.size) {
        listOfNumbers[index] = index;
        index++
    }
    for(number in listOfNumbers) {
        println(number)
    }

    /**
     * Immutable
     * */
    val names: List<String> = listOf("João", "Gabriel")

    /**
     * Mutable
     * */
    val surnames: MutableList<String> = mutableListOf("Carvalho", "Lopes", "Cruz")
    surnames.add("Another surname")

    val values: Set<Double> = setOf(10.0, 9.0, 8.0, 7.0, 6.0, 5.0)
    val anotherMutableValues: MutableSet<Double> = mutableSetOf(10.0, 9.0, 8.0, 7.0, 6.0, 5.0)

    val keyAndValue: Map<Int, String> = mapOf(Pair(1, "First"), Pair(2, "Second"))
    val keyAndValueMutable: MutableMap<Int, String> = mutableMapOf(Pair(1, "First"), Pair(2, "Second"))

    keyAndValueMutable[3] = "Third"

    println(surnames)
}