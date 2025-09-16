//leetcode link - https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

class Solution {  
    public boolean check(int[] nums) {
        int i; 
        int count = 0;
        int n = nums.length;
        for(i=0;i<n;i++){
            if(nums[i] > nums[(i+1)%n]){
                count++;
            }            
        }
        if(count <= 1){
            return true;
        }
        else{
            return false;
        }
    }
}