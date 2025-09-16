//leetcode link - https://leetcode.com/problems/single-number/

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> h= new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> it : h.entrySet()){
            if(it.getValue() == 1){
                return it.getKey();
            }
        }
    return 0;   
    }
    
}