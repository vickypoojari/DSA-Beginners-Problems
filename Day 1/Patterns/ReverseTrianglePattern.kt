/*
======================
Output:
*********
 *******
  *****
   ***
    *
======================
    • Time Complexity: O(n^2) => Nested loops.
    • Space Complexity: O(1) => No additional space used.
======================
*/

fun main() {
    val n = 5

    for (i in n downTo 1) {
        // Print leading spaces
        for (k in 0 until (n - i)) {
            print(" ")
        }

        // Print stars
        for (j in 0 until (i * 2 - 1)) {
            print("*")
        }

        // Move to the next line
        println()
    }
}