/*
======================
Problem: Reverse String
======================
Hint:
- Write a function that reverses a string in-place. The input string is given as an array of characters `s`.
- Modify the input array with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

Constraints:
1. 1 <= s.length <= 10^5
2. s[i] is a printable ASCII character.

Time Complexity: O(n) => Single loop through half of the array.
Space Complexity: O(1) => No additional space used apart from variables.
*/

fun main() {
    val s = charArrayOf('h', 'e', 'l', 'l', 'o')
    // Iterate through half of the array
    for (i in 0 until s.size / 2) {
        // Swap the elements at indices `i` and `s.size - i - 1`
        val temp = s[i]               // Store the current character in a temporary variable
        s[i] = s[s.size - i - 1]      // Replace `s[i]` with its counterpart from the end
        s[s.size - i - 1] = temp      // Replace the counterpart with the stored character
    }
}