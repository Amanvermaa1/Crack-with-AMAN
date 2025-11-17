class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int left = -1 ; 
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]==1){
                if(left !=-1 && i-left-1 <k){
                    return false;
                }
                left = i ;
            }
           
        }
        return true;
       
    }
}