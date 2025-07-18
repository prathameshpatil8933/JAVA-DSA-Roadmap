// Problem: https://leetcode.com/problems/two-sum/ <br>
//Approach: HashMap <br>
//Time: O(n), Space: O(n)
-------------------------------------------------------------------------------------------
BRUTE FORCE 
  class Solution {
    public int[] twoSum(int[] nums, int target) {
      for(int i=0;i<nums.length;i++){
       for(int j=0;j<nums.length;j++){
        if(nums[i]+nums[j]==target){
            int arr1[]=new int[2];
            arr1[0]=i;
            arr1[1]=j;
            return arr1;
        }
      } 
      }  
return new int[0];
    }
}
// Test case was failing as it doesn'w want same element , we want two elements 
/// sum and their index is to be returned so second loop intiliazed with i
-------------------------------------------------------------------------------------------
OPTIMIZED CODE
  import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
          int complement=target-nums[i];

          if(map.containsKey(complement)){
            return new int[]{map.get(complement),i};
          }


     map.put(nums[i],i);
      }
      

return new int[0];
    }
}
