/*
======================
Problem: Find Minimum and Maximum in an Array
======================
Hint:
- Write a program to find the minimum and maximum values in an array of integers.
- The program should iterate through the array in a single pass for both minimum and maximum values.

Example 1:
Input: arr = [3, 2, 1, 56, 10000, 167]
Output:
Minimum: 1
Maximum: 10000

Example 2:
Input: arr = [7, 7, 7, 7]
Output:
Minimum: 7
Maximum: 7

Constraints:
1. 1 <= arr.length <= 10^5
2. -10^5 <= arr[i] <= 10^5

Time Complexity: O(n) => Single loop iterating through the array.
Space Complexity: O(1) => No additional space used apart from variables.
*/

fun main() {
    val arr = intArrayOf(3, 2, 1, 56, 10000, 167)

    var max = arr[0]  // Initialize max with the first element
    var min = arr[0]  // Initialize min with the first element

    // Loop to find the min and max values
    for (i in 0 until arr.size - 1) {
        if (max < arr[i + 1]) { // Update max if current element is greater
            max = arr[i + 1]
        }
        if (min > arr[i + 1]) { // Update min if current element is smaller
            min = arr[i + 1]
        }
    }

    // Output the results
    println("Minimum: $min")
    println("Maximum: $max")
}