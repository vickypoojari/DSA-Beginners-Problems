/*
======================
Output:
1
22
333
4444
55555
======================
• Time Complexity: O(n^2) => This is due to the nested loops.
• Space Complexity: O(1) => This is because no additional memory is used apart from a few variables.
======================
*/

fun main() {
    val n = 5  // Number of lines

    // Outer loop to iterate from 1 to n (controls the number of rows)
    for (i in 1..n) {
        // Inner loop to print the value of 'i', 'i' times
        for (j in 1..i) {
            print(i)  // Print the number 'i' for each position in the current row
        }

        // Move to the next line after printing 'i' for the current row
        println()
    }
}