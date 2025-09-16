//gfg link - http://geeksforgeeks.org/problems/who-will-win-1587115621/1

class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == k){
                return true;
            }
        }
        return false;
    }
}