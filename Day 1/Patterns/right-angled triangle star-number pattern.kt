/*
======================
Output:
1
12
123
1234
12345
======================
• Time Complexity: O(n^2) => This is due to the nested loops.
• Space Complexity: O(1) => This is because no additional memory is used apart from a few variables.
======================
*/

fun main() {
    val n = 5  // Number of lines

    // Outer loop to iterate from 1 to n (controls the number of rows)
    for (i in 1..n) {
        // Inner loop to print numbers from 1 to i
        for (j in 1..i) {
            print(j)  // Print numbers from 1 to i for the current row
        }

        // Move to the next line after printing numbers for the current row
        println()
    }
}


/*
======================
Output:
*
*
***
****
*****
======================
• Time Complexity: O(n^2) => This is due to the nested loops.
• Space Complexity: O(1) => This is because no additional memory is used apart from a few variables.
======================
*/

fun main() {
    val n = 5  // Number of lines

    // Outer loop to iterate from 1 to n (controls the number of rows)
    for (i in 1..n) {
        // Inner loop to print numbers from 1 to i
        for (j in 1..i) {
            print("*")  // Print numbers from 1 to i for the current row
        }

        // Move to the next line after printing numbers for the current row
        println()
    }
}