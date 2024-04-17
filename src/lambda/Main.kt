package lambda

/**
 * parameters -> body of execution
 * */

fun main() {

    val isOdd = { num: Int -> num % 2 == 1 }
    println(isOdd(5))

    val fac = { num: Int -> Int
        var index: Int = num
        var fat: Int = 1
        while (index > 0) {
            fat *= index
            index--
        }
        fat
    }

    println(fac(5))

}