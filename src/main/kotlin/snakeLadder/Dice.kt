package snakeLadder

import java.util.*

class Dice(
    private val diceCount: Int,
    private val minCount: Int = 1,
    private val maxCount: Int = 6
) {


    fun rollDice(): Int {

        var totalSum = 0
        var rollCount = 0

        while (rollCount < diceCount) {
            totalSum += rand(minCount, maxCount)
            rollCount += 1

        }

        return totalSum

    }

    private fun rand(start: Int, end: Int): Int {
        require(!(start > end || end - start + 1 > Int.MAX_VALUE)) { "Illegal Argument" }
        return Random(System.nanoTime()).nextInt(end - start + 1) + start
    }

}