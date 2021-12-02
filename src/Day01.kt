import java.io.File

fun readInput(name: String) = File("src", "$name.txt").readLines()

fun solve(raw_input: List<String>, windowSize: Int): Int {
    val input = raw_input.map { it.toInt() }
    return input
        .windowed(windowSize) { it.sum() }
        .zipWithNext()
        .count { (prev, next) -> next > prev }
}

fun part1(raw_input: List<String>): Int {
    return solve(raw_input, 1)
}

fun part2(raw_input: List<String>): Int {
    return solve(raw_input, 3)
}

fun main(args: Array<String>) {
    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
