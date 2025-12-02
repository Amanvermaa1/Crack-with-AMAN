class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long total = 0 ;
        for(long i : batteries){
            total+= i ;
        }
        long low = 0 ; 
        long high = total/n ;
        while(low<high){
            long mid = (low+high+1)/2 ;
            long usable = 0 ;
            for(int i : batteries){
                usable += Math.min(i , mid);
            }
            if(usable>=mid*n){
                low = mid ;
            } else{
                high = mid-1 ;
            }
        }
        return low ;
    }
   
    
}