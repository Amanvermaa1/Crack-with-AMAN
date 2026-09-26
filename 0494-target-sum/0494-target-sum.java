class Solution {
    public int findTargetSumWays(int[] arr, int target) {
        
        int  sum = 0 ; 
        for(int i : arr){
            sum+= i; 
        }
         if (Math.abs(target) > sum) {
            return 0;
        }
        if((sum + target) %2 !=0){
            return 0 ;
        }
        int val = (target + sum)/2 ;
        return countSub(arr, val);
    }
    static int countSub(int[] arr , int sum){
        
		int n = arr.length ;
		int dp[][] = new int[n + 1][sum + 1];
		dp[0][0] = 1 ;
		for (int i = 1 ; i <= n; i++) {
			for (int j = 0 ; j <= sum ; j++) {
				if (arr[i - 1] <= j) {
					dp[i][j] = (dp[i - 1][j - arr[i - 1]] + dp[i - 1][j]);
				}
				else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		return dp[n][sum];
    }
}

