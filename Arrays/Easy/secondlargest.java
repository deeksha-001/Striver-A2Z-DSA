//gfg link - https://www.geeksforgeeks.org/problems/second-largest3735/1
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int i;
        int n = arr.length;
        int largest = arr[0];
        int slargest = -1;
            
        for(i = 0;i<n;i++)
        {
              if(arr[i] > largest)
            {
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] != largest && arr[i] > slargest)
            {
                slargest = arr[i];
            }
        }
        return slargest;
    }
}