class Solution {
    public int minRemoval(int[] nums, int k) {
      Arrays.sort(nums);
      int n = nums.length ;
      int j = 0 ;
      
      int maxlen = 1 ;
      for(int i = 0 ; i<n ; i++){
        
      while(j<n && (long) nums[j]<=(long)nums[i]*k){
        j++;
        
      }  
        maxlen = Math.max(maxlen,j-i);
      }
      return n-maxlen ;

    }
}