/*
======================
Output:
*
**
***
****
*****
****
***
**
*
======================
    • Time Complexity: O(n^2) => Nested loops, with up to n iterations in the inner loop.
    • Space Complexity: O(1) => No additional space used.
======================
*/

fun main() {
    val n = 5  // Number of rows in the top half

    for (i in 1..(2 * n - 1)) { // Iterate through all rows
        val stars = if (i <= n) i else 2 * n - i // Calculate stars based on row number
        for (j in 1..stars) {  // Print stars for the current row
            print("*")
        }
        println() // Move to the next line
    }
}