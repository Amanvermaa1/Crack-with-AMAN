class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        long ans = 0 ;
        for(int i : nums){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        ans = (long)max-(long)min ;
        return ans* k ;
    }
}