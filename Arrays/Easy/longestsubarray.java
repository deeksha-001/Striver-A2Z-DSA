// gfg link - https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int maxLen = 0;
        
        for(int i = 0;i<n;i++){
            sum += arr[i];
            
            if(sum == k)
            {
                int len = i+1;
                maxLen = Math.max(maxLen,len);
            }
            
            if(map.containsKey(sum - k)){
                int pi = map.get(sum - k);
                int length = i - pi;
                maxLen = Math.max(maxLen,length);
            }
            
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}
