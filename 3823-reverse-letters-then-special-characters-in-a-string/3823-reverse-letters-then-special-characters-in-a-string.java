class Solution {
    public String reverseByType(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder special = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch >='a' && ch<='z'){
                letters.append(ch);
            }
            else{
                special.append(ch);
            }

        }
        letters.reverse();
        special.reverse();

        StringBuilder ans = new StringBuilder();
        int l = 0, sp = 0 ;
        for(int i = 0 ; i<s.length();i++){
             if(s.charAt(i) >='a' && s.charAt(i)<='z'){
                ans.append(letters.charAt(l++));
            }
            else{
                ans.append(special.charAt(sp++));
            }
        }
        
    return ans.toString();
    }
}