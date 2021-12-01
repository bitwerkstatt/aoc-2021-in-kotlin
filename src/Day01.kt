import java.io.File

fun readInput(name: String) = File("src", "$name.txt").readLines()

fun part1(raw_input: List<String>): Int {
    val input = raw_input.map { it.toInt() }
    return input
        .zipWithNext()
        .count { (prev, next) -> next > prev }
}

fun part2(raw_input: List<String>): Int {
    val input = raw_input.map { it.toInt() }
    val windowSize = 3
    return input
        .windowed(windowSize) { it.sum() }
        .zipWithNext()
        .count { (prev, next) -> next > prev }
}

fun main(args: Array<String>) {
    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
