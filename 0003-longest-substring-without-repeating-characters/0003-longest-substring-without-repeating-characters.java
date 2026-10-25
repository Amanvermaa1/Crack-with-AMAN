class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 ;
        int n = s.length();
        int count = 0 ; 
        Set<Character> set = new HashSet<>();
        for(int right = 0 ; right < n; right++){
            char ch = s.charAt(right);
            if(set.contains(ch)){
                while(set.contains(ch)){

                set.remove(s.charAt(left));
                left++ ;
                }
                set.add(ch);
            }
            else{
                set.add(ch);
                count = Math.max(count,right-left+1);
            }
        }
        return count ;
    }
}