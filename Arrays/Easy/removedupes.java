//leetcode link - https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i<nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}