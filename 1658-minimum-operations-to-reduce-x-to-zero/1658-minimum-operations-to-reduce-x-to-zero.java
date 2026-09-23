class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0 ; 
        for(int i  : nums){
            total+= i ;
        }
         if (x > total) {
            return -1;
        }
        int target =  total -  x;
        int left = 0 , sum = 0 , maxlen = - 1;
        for(int right = 0; right < nums.length ; right++){
            sum += nums[right];
            while(sum > target){
                sum -= nums[left];
                left++ ;
            }
            if(sum == target){

            maxlen = Math.max(maxlen ,right-left+ 1 ); 
            }
        }
         if (target == 0) {
            return nums.length;
        }

        if (maxlen == -1) {
            return -1;
        }

        return nums.length - maxlen;
    }
}