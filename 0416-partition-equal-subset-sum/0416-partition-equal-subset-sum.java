class Solution {
    public boolean canPartition(int[] arr) {
         int sum = 0;
        for(int val : arr){
            sum+=val;
        }
        if(sum%2!=0) return false;
        return isSubsetSum(arr, sum/2);
    }
	static boolean isSubsetSum(int arr[], int sum) {
		int n = arr.length ;
		boolean dp[][] = new boolean[n + 1][sum + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0] = true;
		}
		for (int i = 1 ; i <= n; i++) {
			for (int j = 1 ; j <= sum ; j++) {
				if (arr[i - 1] <= j) {
					dp[i][j] = (dp[i - 1][j - arr[i - 1]] || dp[i - 1][j]);
				}
				else if (arr[i - 1]> j) {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		return dp[n][sum];
    }
}