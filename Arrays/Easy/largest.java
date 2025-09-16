//gfg link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1

class Solution {
    public static int largest(int[] arr) {
        // code here       
        int n1 = arr.length;
            int largest = arr[0];
            for(int i=1;i<n1;i++){
                if(arr[i] > largest){
                    largest = arr[i];
            }
    }
    return largest;
    }
        
    }