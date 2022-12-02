fun main() {

    fun part1(lines: List<String>): Int {
        var score = 0
        for (round in lines.map { Pair(it[0] - 'A', it[2] - 'X') }) {
            score += round.second + 1
            if (round.first == round.second) score += 3
            if ((round.first + 1) % 3 == round.second) score += 6
        }
        return score
    }

    fun part2(lines: List<String>): Int {
        var score = 0
        for (round in lines.map { Pair(it[0] - 'A', it[2] - 'X') }) {
            score += when (round.second) {
                1 -> 3 + round.first + 1
                2 -> 6 + (round.first + 1) % 3 + 1
                else -> (round.first + 2) % 3 + 1
            }
        }
        return score
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
