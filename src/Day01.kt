fun main() {

    fun part1(input: List<String>): Int {
        var count: Int = 0
        for (index in input.indices) {
            if (index > 0) {
                if (input[index].toInt() > input[index - 1].toInt()) {
                    count++
                }
            }
        }
        return count
    }

    fun part2(input: List<String>): Int {
        var count: Int = 0
        val windowSize: Int = 3
        var lastAvg = 0.0f
        var avg = 0.0f
        val inputInt = input.map { it.toInt() }
        val windows = inputInt.windowed(windowSize)
        for (window_index in windows.indices) {
            avg = windows[window_index].sum() / windowSize.toFloat()
            if (window_index > 0) {
                if (avg > lastAvg) {
                    count++
                }
            }
            lastAvg = avg
        }
        return count
    }

//    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
