fun main() {

    fun solve(input: List<List<Int>>, count: Int): Int {
        return input.map { it.sum() }.sortedDescending().take(count).sum()
    }

    val input = readNumbersGroups("Day01")
    println(solve(input, 1))
    println(solve(input, 3))
}
