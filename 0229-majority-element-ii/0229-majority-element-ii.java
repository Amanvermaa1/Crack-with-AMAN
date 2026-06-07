class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length ;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            if(entry.getValue() > n/3){
                ans.add(entry.getKey());
            }
        }
    return ans ;
    }
}