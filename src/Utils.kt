import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

const val NewLine = "\r\n"

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = File("inputs", "$name.txt")
    .readLines()

/**
 * Reads numbers from the given input txt file.
 */
fun readNumbers(name: String) = File("inputs", "$name.txt")
        .readLines()
        .map { it.toIntOrNull() }

/**
 * Reads numbers groups from the given input txt file.
 */
fun readNumbersGroups(name: String, separator: String = "$NewLine$NewLine") = File("inputs", "$name.txt")
    .readText()
    .split(separator)
    .map { it.lines().map { it.toInt() } }

/**
 * Converts string to md5 hash.
 */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')
