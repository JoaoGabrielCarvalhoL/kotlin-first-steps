import java.math.BigInteger
import kotlin.math.E
import kotlin.math.PI
import kotlin.math.max
import kotlin.math.sqrt
import kotlin.system.exitProcess

fun someMessage(): String {
    return "Hello guys"
}

fun factorial(number: Long): Long {
    if (number == 0L) {
        return 1L
    }
    var index: Long = number
    var fat: Long = 1L
    while (index > 0) {
        fat *= index
        index--
    }
    return fat
}

fun inline(firstNumber: Int, secondNumber: Int): Int = (firstNumber + secondNumber)

fun someMessage(message: String): Unit = println(message)

/**
 * Write a function that is capable of receiving the number of years and transforming it into months, days, hours,
 * minutes and seconds.
 * 2 years are equivalent to: [24 months, 730 days, 17520 hours, 1051200 minutes and 63072000 seconds.]
 * */
fun decomposeYear(year: Int): Unit {
    val month: Int = 12;
    val days: Int = 365;
    val hours: Int = 8760;
    val minutes: Int = 525600;
    val seconds: Int = 31536000

    if (year <= 0) {
        println("Invalid input.")
        exitProcess(1);
    }

    if (year == 1) {
        println(
            "Year: $year\n" +
                    "Month: ${month}\n" +
                    "Days: ${days}\n" +
                    "Hours: ${hours}\n" +
                    "Minutes: ${minutes}\n" +
                    "Seconds: ${seconds}\n"
        )
    } else {
        println(
            "Year: $year\n {" +
                    "\n\tMonth: ${month * year}\n" +
                    "\tDays: ${days * year}\n" +
                    "\tHours: ${hours * year}\n" +
                    "\tMinutes: ${minutes * year}\n" +
                    "\tSeconds: ${seconds * year}\n }"
        )
    }
}

/**
 * Write a function capable of receiving a string and returning the number of characters.
 * */
fun length(str: String): Int = (str.length)

/**
 * Write a function capable of calculating the cube of an integer.
 * */
fun cube(number: Int): Int = (number * number * number)

/**
 * Write a function capable of receiving miles and converting them to kilometers.
 * */
fun toKilometers(miles: Double): Double = (miles * 1.6)

/**
 * Write a function that is capable of receiving a string and replacing the letters "a" or "A" with "x".
 * */
fun replacing(str: String): String {
    println("Replacing all letters A with X...")
    if (!str.contains("a")) {
        println("Nothing to change.")
        return str;
    } else {
        str.lowercase();
        return str.replace("a", "x", ignoreCase = false)
    }
}

/**
 * Reminds the structure of the switch case.
 * */
fun usageWhen(str: String) : Unit {
    when(str) {
        "João" -> {
            println("First Name")
        }
        "Gabriel" -> {
            println("Second Name")
        }
        "Carvalho" -> {
            println("Third Name")
        }
        else -> {
            println("=(")
        }
    }
}

fun input(): Unit {
    print("Type some message: ")
    val message = readlnOrNull()
    println(message);
}

fun ascending(): Unit {
    for (i in 1..10) {
        println(i)
    }
    println()
}

fun descending(): Unit {
    for (i in 10 downTo 1) {
        println(i);
    }
    println()
}

fun steep(): Unit {
    for (i in 0..100 step 5) {
        println(i);
    }
    println()
}

/**
 * Consider a 2 thousand liter water tank. Rômulo would like to fill the water tank with 7-liter water balloons.
 * How many balloons can fit in the water tank without exceeding the volume?
 * */
fun numberOfBalloonsInTwoThousandLiters(): Int {
    val waterTankVolume: Int = 2000;
    val balloonsVolume: Int = 7;
    var amountBalloons: Int = 0;

    while (((balloonsVolume * amountBalloons) + balloonsVolume) <= waterTankVolume) {
        amountBalloons++
    }
    return amountBalloons;
}

/**
 * FizzBuzz. Print the numbers from 1 to 50 in ascending order according to the rule below:
 * - When a number is divisible by 3, print Buzz.
 * - When a number is divisible by 5, print Fizz.
 * - When a number is divisible by 3 and 5, print FizzBuzz.
 * */
fun fizzBuzz(): Unit {
    for (number in 1..50) {
        if(number % 3 == 0 && number % 5 == 0) {
            println("FizzBuzz")
        } else if (number % 3 == 0) {
            println("Buzz")
        } else if(number % 5 == 0) {
            println("Fizz")
        } else {
            println(number)
        }
    }
}

/**
 * Write a program capable of receiving text and printing it inverted.
 * Input: My name is Julius.
 * Output: .suiluJ is emon ueM
 * */
fun reverse(str: String): CharArray {
    var index = str.length - 1
    val reverseChar: CharArray = CharArray(str.length)
    var count:Int = 0
    while(index >= 0) {
        print(str[index]);
        reverseChar[count] = str[index]
        index--
        count++
    }
    return reverseChar
}

/**
 * Write a function that takes a string, checks whether there are the same
 * number of characters 'x' and 'o' and returns true or false. If there is neither 'x' nor 'o',
 * return false.
 * */
fun checkLetters(str: String) : Boolean {
    var counterX: Int = 0
    var counterO: Int = 0
    var wasFounded: Boolean = false

    for (index in str.indices) {
        if (str[index].lowercase() == "x") {
            counterX++
            wasFounded = true
        } else if (str[index].lowercase() == "o") {
            counterO++
            wasFounded = true
        }
    }

    if(!wasFounded) {
        return false
    }

    return counterX == counterO
}

fun nullSafety(): Unit {
    val str: String? = null;
    println(str?.length)
    //println(str ?: "Null")
}

fun main() {
    println("Hello World!")

    val name: String = "João Gabriel Carvalho"
    println(String.format("Hi %s", name))
    println("Hi $name")
    val someNumber: BigInteger = BigInteger("5000")
    println(someNumber)
    println(someMessage())
    println(message)

    printing()

    val number: Long = 5L
    val factorial = factorial(5L)
    println("Factorial of $number!: $factorial")
    println("Sum: ${inline(1, 4)}")
    someMessage("Some message")
    println(sqrt(9.0))

    decomposeYear(18)

    usageWhen("Carvalho")

    input()

    ascending()

    descending()

    steep()

    val numberOfBalloonsInTwoThousandLiters = numberOfBalloonsInTwoThousandLiters()
    println(numberOfBalloonsInTwoThousandLiters)
    println(2000 / numberOfBalloonsInTwoThousandLiters)

    fizzBuzz()

    val reverse = reverse("João Gabriel")
    println(reverse)

    println(checkLetters("xxoo"))
    println(checkLetters("abcd"))

    nullSafety()
}

private fun printing() {
    println("Double Max Value: ${Double.MAX_VALUE} - Min Value: ${Double.MIN_VALUE}")
    println("Float Max Value: ${Float.MAX_VALUE} - Min Value: ${Float.MIN_VALUE}")
    println("Long Max Value:  ${Long.MAX_VALUE} - Min Value: ${Long.MIN_VALUE}")
    println("Long Unsigned Max Value: ${ULong.MAX_VALUE} - Min Value: ${ULong.MIN_VALUE}")
    println("Int Max Value: ${Int.MAX_VALUE} - Min Value: ${Int.MIN_VALUE}")
    println("Int Unsigned Max Value: ${UInt.MAX_VALUE} - Min Value: ${UInt.MIN_VALUE}")
    println("Short Max Value: ${Short.MAX_VALUE} - Min Value: ${Short.MIN_VALUE}")
    println("Short Unsigned Max Value: ${UShort.MAX_VALUE} - Min Value: ${UShort.MIN_VALUE}")
    println("Byte Max Value: ${Byte.MAX_VALUE} - Min Value: ${Short.MIN_VALUE}")
    println("Byte Unsigned Max Value: ${UByte.MAX_VALUE} - Min Value: ${UByte.MIN_VALUE}")
    println(PI)
    println(E)
    println(max(15.0, 15.1))
    println(max(14.0, 14.0))
}

const val message: String = "This is a final message"
const val number: Int = 28

/**
 *  var: for mutable variables
 *  val: to immutable variables.
 *  Unit: type says that a function has no return.
 *
 * */