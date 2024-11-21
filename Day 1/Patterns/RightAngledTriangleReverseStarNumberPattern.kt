/*
======================
Output:
12345
1234
123
12
1
======================
• Time Complexity: O(n^2) => Due to the nested loops.
• Space Complexity: O(1) => No additional memory usage apart from a few variables.
======================
*/

fun main() {
    val n = 5  // Number of lines

    // Outer loop to control the number of rows
    for (i in 0 until n) {
        // Inner loop to print numbers for the current row
        for (j in 1..(n - i)) {
            print(j) // Print the numbers from 1 up to (n - i)
        }
        // Move to the next line after printing the numbers for the current row
        println()
    }
}

/*
======================
Output:
*****
****
***
**
*
======================
• Time Complexity: O(n^2) => This is due to the nested loops.
• Space Complexity: O(1) => This is because no additional memory is used apart from a few variables.
======================
*/

fun main() {
    val n = 5  // Number of lines

    // Outer loop to control the number of rows
    for (i in 0 until n) {
        // Inner loop to print stars for the current row
        for (j in (n - i) downTo 1) {
            print("*") // Print one star
        }
        // Move to the next line after printing stars for the current row
        println()
    }
}