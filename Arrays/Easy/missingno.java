//leetcode link - https://leetcode.com/problems/missing-number/

class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0,xor2 = 0;
        int n = nums.length;
        for(int i = 0; i<n;i++){
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ (i+1);
        }
        
          return xor1 ^ xor2;
    }
}
  