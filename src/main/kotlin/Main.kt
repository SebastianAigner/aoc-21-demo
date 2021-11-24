import java.io.*
import kotlin.io.path.*

fun main(args: Array<String>) {
    val input = File("day01.txt").readText()
    val input2 = Path("day01.txt").readLines()

    val sanitized = "    5-6-7 ".trim() // "5-6-7"
    val numbers = sanitized.split("-").map { it.toInt() }
    // [5, 6, 7]

    val regex = """(\d)-(\d)-(\d)""".toRegex()
    val moreNumbers = "1-2-3"
    val (a, b, c) = regex.find(moreNumbers)?.destructured ?: error("Oh no!")
    // a=1, b=2, c=3
}