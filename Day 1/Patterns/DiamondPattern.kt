/*
======================
Output:
    *
   ***
  *****
 *******
*********
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
    val n = 5  // Number of rows for the top and bottom parts of the pattern

    // Top part (Pyramid)
    for (i in 1..n) {
        // Print leading spaces
        for (j in 0 until (n - i)) {
            print(" ")
        }
        // Print stars
        for (k in 0 until 2 * i - 1) {
            print("*")
        }
        println()
    }

    // Bottom part (Inverted Pyramid)
    for (i in n downTo 0) {
        // Print leading spaces
        for (j in 0 until (n - i)) {
            print(" ")
        }
        // Print stars
        for (k in 0 until 2 * i - 1) {
            print("*")
        }
        println()
    }
}