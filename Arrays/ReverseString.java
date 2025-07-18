// Problem: https://leetcode.com/problems/reverse-string/description/ <br>
//Approach:Two Pointers <br>
//Time: O(n), Space: O(n)
-------------------------------------------------------------------------------------------
BRUTE FORCE 
class Solution {
    public void reverseString(char[] s) {

    char[] temp = new char[s.length]; 
    for (int i = 0; i < s.length; i++) {
        temp[i] = s[s.length - 1 - i]; 
    }
    System.arraycopy(temp, 0, s, 0, s.length); // Copy back
}
        
    }
-------------------------------------------------------------------------------------------
OPTIMIZED CODE
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}

