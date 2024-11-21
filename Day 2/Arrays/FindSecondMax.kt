/*
======================
Problem: Find Max and Second Max
======================
Hint:
- Write a program to find the maximum and second maximum values in an array of integers.
- The program should use O(1) extra memory.

Example 1:
Input: arr = [3, 2, 1, 56, 100, 56]
Output:
Max: 100
Secondmax: 56

Example 2:
Input: arr = [10, 5, 5]
Output:
Max: 10
Secondmax: 5

Constraints:
1. 2 <= arr.length <= 10^5
2. -10^5 <= arr[i] <= 10^5

Time Complexity: O(n) + O(n) => O(2n) => O(n)
    - First loop: Find max value (O(n)).
    - Second loop: Find second max value (O(n)).
Space Complexity: O(1) => No additional space used apart from variables.
*/

fun main() {
    val arr = intArrayOf(3, 2, 1, 56, 100, 56)

    var max = 0    // Variable to store the maximum value
    var secondmax = -1 // Variable to store the second maximum value

    // First loop: Find the maximum value
    for (i in 0 until arr.size) {
        if (max < arr[i]) {
            max = arr[i]
        }
    }

    // Second loop: Find the second maximum value
    for (i in 0 until arr.size) {
        if (secondmax < arr[i] && arr[i] != max) {
            secondmax = arr[i]
        }
    }

    // Output the results
    println("Max: $max")
    println("Secondmax: $secondmax")
}