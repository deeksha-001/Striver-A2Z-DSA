/**
 gfg link- https://www.geeksforgeeks.org/problems/merge-sort/1
 **/

class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if (l >= r) return;
        int m = l + (r - l) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    
    }
    
    void merge(int arr[],int l,int m,int r){
        int low = l;
        int high = m+1;
        //int n = arr.length;
        int[] temp = new int[r-l+1];
        int k =0;
        while(low <= m && high <= r){
            if(arr[low] <= arr[high]){
                temp[k++] = arr[low++];
            }
            else{
                temp[k++] = arr[high++];
            }
        }
        while(low <= m){
            temp[k++] = arr[low++];
        }
        while(high <= r){
            temp[k++] = arr[high++];
        }
        for(int i = l;i<=r;i++){
            arr[i] = temp [i-l];
        }
    }
}