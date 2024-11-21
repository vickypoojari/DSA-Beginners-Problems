/*
======================
Output:
1
10
101
1010
10101
======================
    • Time Complexity: O(n^2) => Nested loops where the outer loop runs `n` times and the inner loop depends on the outer loop's value.
    • Space Complexity: O(1) => No additional space used apart from variables.
======================
*/

fun main() {
    val n = 5  // Number of rows for the pattern

    for (i in 1..n) {
        // Initialize `star` as 1 for odd rows and 0 for even rows
        var star = if (i % 2 == 0) 0 else 1

        for (j in 1..i) {
            print(star)        // Print the current value of `star`
            star = 1 - star    // Toggle `star` between 1 and 0
        }
        println()  // Move to the next line after printing stars in the current row
    }
}