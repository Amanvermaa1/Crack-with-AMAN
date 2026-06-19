class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length ;
        int []arr = new int[n+1];
        arr[0] = 0 ;
        int ans = 0 ;
        for(int i = 1 ; i<gain.length+1 ; i++){
            arr[i] = gain[i-1] + arr[i-1];
            ans = Math.max(ans,arr[i]);
        }
     //   System.out.print(arr);
        return ans ;
    }
}