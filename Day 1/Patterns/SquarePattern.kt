/*
======================
Output:
*****
*****
*****
*****
*****
======================
	•	Time Complexity:  O(n^2) => This is due to the nested loops.
	•	Space Complexity:  O(1)  => This is because no additional memory is used apart from a few variables.
======================
 */

// My Approach
fun main() {
    val n = 5 // Number of lines

    // Outer loop to repeat the pattern
    for (i in 0 until n) {

        // First block of stars: print 'n' stars in one line
        for (j in 0 until n) {
            print("*") // Print one star without moving to a new line
        }

        println()
    }
}


// Alternative Approach
fun main() {
    val star = "* ".repeat(n)

    // Outer loop to repeat the pattern
    for (i in 0 until n) {
        println(star)
    }
}


