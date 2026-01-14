class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = Integer.MIN_VALUE ;
        int minSum = Integer.MAX_VALUE ;
        int currMax= 0 , currMin = 0 ;
        // int result = Integer.MIN_VALUE ;
        int totalSum= 0 ;
        // int sum = 0 ;
       for(int i : nums){
        currMax = Math.max(currMax + i, i);
        maxSum =Math.max(maxSum, currMax);
        currMin = Math.min(currMin + i , i);
        minSum = Math.min(minSum , currMin);
        totalSum += i ;
       }
       if(maxSum>0){
        return Math.max(maxSum,totalSum-minSum);
       }
       return maxSum ;
    }
}