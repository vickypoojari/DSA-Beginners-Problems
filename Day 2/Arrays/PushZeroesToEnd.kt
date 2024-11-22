/*
======================
Problem: Push All Zeros to the End
======================
Hint:
- Write a program to move all zeros in an array to the right end while maintaining the order of non-zero elements.
- The operation should be done in place without using extra space.

Example 1:
Input: arr = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]

Example 2:
Input: arr = [10, 20, 30]
Output: [10, 20, 30]

Example 3:
Input: arr = [0, 0]
Output: [0, 0]

Constraints:
1. 1 <= arr.length <= 10^5
2. -10^5 <= arr[i] <= 10^5

Time Complexity: O(n)
    - One loop to move non-zero elements (O(n)).
    - Another loop to fill remaining zeros (O(n)).
Space Complexity: O(1) => In-place modifications without extra space.
*/

fun main() {
    val arr = intArrayOf(1, 2, 0, 4, 3, 0, 5, 0)
    var index = 0

    // Move all non-zero elements to the front
    for (i in arr.indices) {
        if (arr[i] != 0) {
            arr[index] = arr[i]
            index++
        }
    }

    // Fill the remaining positions with zeros
    while (index < arr.size) {
        arr[index] = 0
        index++
    }

    // Print the updated array
    println("Output: ${arr.toList()}")
}