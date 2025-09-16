//gfg link : https://www.geeksforgeeks.org/problems/selection-sort/1

class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        if(n>=1 && n<=1000){
            for(int i=0;i<=n-2;i++){
                int min = i;
                for(int j=i+1;j<=n-1;j++){
                    if(arr[j]<arr[min]){
                        min=j;
                    }
                }
                
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}