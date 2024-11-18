//Question:Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
//Note: The second largest element should not be equal to the largest element.
class Solution {
    public int getSecondLargest(int[] arr) {
        int larnum,sec;
        larnum=sec=Integer.MIN_VALUE;
        int n=arr.length;
        if(n<2){
            return -1;
        }
        for(int i=0;i<n;i++){
            if(arr[i]>larnum){
                sec=larnum;
                larnum=arr[i];
            }
            else if(arr[i]>sec && arr[i]!=larnum){
                sec=arr[i];
                
            }}
            if(sec==Integer.MIN_VALUE){
                return -1;
            }
        
        return sec;
    }
}
