/*
======================
Output:
    *
   ***
  *****
 *******
*********
======================
	•	Time Complexity:  O(n^2) => This is due to the nested loops.
	•	Space Complexity:  O(1)  => This is because no additional memory is used apart from a few variables.
======================
 */

fun main() {
    val n = 5 // Number of lines (height of the pyramid)

    // Outer loop to control the number of rows
    for (i in 0 until n) {
        // 'i' represents the current row number, starting from 0

        // Inner loop to print spaces before the stars
        for (j in 0 until (n - i)) {
            // 'n - i' calculates the number of spaces needed to center-align the stars
            print(" ") // Print a single space
        }

        // Inner loop to print stars
        for (k in 0 until (2 * i + 1)) {
            // '2 * i + 1' determines the number of stars in the current row
            print("*") // Print a single star
        }

        // Move to the next line after printing all spaces and stars for the current row
        println()
    }
}
