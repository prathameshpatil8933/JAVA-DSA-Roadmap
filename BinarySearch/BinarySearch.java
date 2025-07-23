//Link : https://leetcode.com/problems/valid-parentheses/description/ 
//Approach : Brute Force 
//Time and Space : O(n)

class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}

 
//Approach : Divide and Conquer,Two Pointer Method
//Time and Space : O(logn)
class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1 ;
    }
}
