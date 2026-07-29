class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1 ; int high = findMax(nums);
        while(low<=high){
            int mid = (low+high)/2;
            int divisor = calculateTotalHours(nums,mid);
            if(divisor<=threshold){
                high = mid -1 ;
            }
            else{
                low = mid+1 ;
            }

        }
        return low ;
        
    }
    private int findMax(int[] nums) {
        int maxi = 0;
        for (int i : nums) {
            maxi = Math.max(maxi, i);
        }
        return maxi;
    }
    

    
    private int calculateTotalHours(int[] nums, int hourly) {
        int totalH = 0;
        for (int pile : nums) {
            totalH += Math.ceil((double) pile / hourly);
        }
        return totalH;
    }

}