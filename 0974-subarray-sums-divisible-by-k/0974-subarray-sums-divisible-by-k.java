class Solution {
    public int subarraysDivByK(int[] nums, int k) {
          HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0 , count = 0 ; 
        for(int i : nums){
            sum+=i ;

            int req = ((sum % k)+k)%k ;
            if(map.containsKey(req)){
                count+= map.get(req);
            }
            map.put(req,map.getOrDefault(req,0)+1);
        }
    return count ;
    }
}