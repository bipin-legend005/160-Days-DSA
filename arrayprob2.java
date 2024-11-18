//Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in place.
class Solution {
    void pushZerosToEnd(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }}
            while(count<n){
                arr[count++]=0;
            }
        }
        
    }

