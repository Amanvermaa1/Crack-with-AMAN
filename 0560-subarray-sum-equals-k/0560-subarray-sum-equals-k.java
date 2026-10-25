class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0 ;
       int sum = 0 ; 
       for(int i : nums){
        sum+= i ;
        int req = sum - k ;
        if(map.containsKey(req)){
            count+= map.get(req);
        }
        map.put(sum, map.getOrDefault(sum,0)+1);
       }
       return count ; 
    }
}