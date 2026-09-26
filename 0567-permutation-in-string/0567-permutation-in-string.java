class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        int freq1[] = new int[26];
        int freq2[] = new int[26];
        if(n1 > n2) return false ;

        for(int i = 0 ; i < s1.length(); i++){
            freq1[s1.charAt(i)- 'a']++ ;
        }
        int left = 0 ;
        for(int right = 0 ; right < s2.length(); right++){
            freq2[s2.charAt(right) - 'a']++ ;

            if(right - left +1 > n1){
                freq2[s2.charAt(left)- 'a']-- ;
            left++ ;
            }
            if(Arrays.equals(freq1 ,freq2)){
                return true ;
            }
        }
    return false ;
    }
}