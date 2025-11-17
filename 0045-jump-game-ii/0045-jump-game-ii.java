class Solution {
    public int jump(int[] nums) {
        int jumps = 0 ;
        int maxidx = 0 ;
        int n = nums.length ;
        int currentIdx = 0 ;
        for(int i = 0 ; i<n-1 ; i++){
        maxidx = Math.max(maxidx , i + nums[i]);
           
           if(i==currentIdx){
            jumps++ ;
            currentIdx = maxidx ;
           }

        
        }
        return jumps ;
    }
}