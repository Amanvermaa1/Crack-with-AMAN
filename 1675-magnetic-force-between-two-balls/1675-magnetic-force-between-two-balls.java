class Solution {
    public int maxDistance(int[] pos, int m) {
        Arrays.sort(pos);
        int low = 0 ;
        int high = pos[pos.length-1]-pos[0];
        int ans = 0 ;
        while(low<=high){
            int mid = (low+high)/ 2 ;
            if(canPlace(pos , m , mid)){
                ans = mid ;
                low = mid +1 ;
            }
            else{
            high = mid-1 ; 

            }
        }
        return ans ;
    }
    private boolean canPlace(int []pos ,int m ,int k){
        int count = 1 ;
        int last = pos[0];
        for(int i = 1 ; i<pos.length; i++){
            if(pos[i]-last >=k){
                count++ ;
                last = pos[i];
                if(count==m) return true ;
            }
        }
        return false ;
    }
    
    
}