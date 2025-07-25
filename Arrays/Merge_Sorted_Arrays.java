Brute Force : 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i=0;i<n;i++){
        nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
     
    }
}
Time: O((m+n) log(m+n)) → Sorting dominates
Space: O(1) → In-place sort (ignoring sorting algo overhead)

Optimized Approach : 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1=m-1;
    int p2=n-1;
    int p=m+n-1;
    while(p2>=0){
        if(p1>=0 && nums1[p1]>nums2[p2]){
            nums1[p--]=nums1[p1--];
        }
        else{
            nums1[p--]=nums2[p2--];
        }
    }

     
    }
}
Time/Space:                                                                                            Time Complexity: O(m + n) — every element is visited once        
  Space Complexity: O(1) — no extra array used, done in-place
