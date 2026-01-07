class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int ans = 1 ;
        while(set.contains(ans)){
            ans++; 
        }
        return ans ;
    }
}