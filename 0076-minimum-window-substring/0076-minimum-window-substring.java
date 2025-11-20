class Solution {
    public String minWindow(String s, String t) {
       
        Map<Character,Integer> map = new HashMap<>();
        for(char i : t.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
    int required = map.size();
    int formed = 0 ;
        Map<Character,Integer> window = new HashMap<>();
    int left = 0 , right = 0 , minlen = Integer.MAX_VALUE ;
    int startidx = 0 ;
    while(right<s.length()){
        char ch = s.charAt(right);
        window.put(ch , window.getOrDefault(ch,0)+1);
        if(map.containsKey(ch) && map.get(ch).intValue() == window.get(ch).intValue() ){
            formed++ ;
        }
            // To shrink thw windoe from left to rigth .
            while(formed==required){
                if(right-left+1 < minlen){
                    minlen = right-left+1 ;
                    startidx = left ;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar , window.get(leftChar)-1);
                if(map.containsKey(leftChar) && map.get(leftChar)>window.get(leftChar)){
                    formed-- ;
                }
                left++ ;
            }
            right++ ;   
        }
       return minlen == Integer.MAX_VALUE ? "" : s.substring(startidx, startidx + minlen);
    }
}