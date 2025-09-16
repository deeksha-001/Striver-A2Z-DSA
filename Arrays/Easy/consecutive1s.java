//leetcode link - https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int maxi = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                cnt++;
                maxi = Math.max(maxi,cnt);
            }
            if(nums[i] == 0){
                cnt = 0;
            }
        }
        return maxi;
    }
}