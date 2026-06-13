class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            int sum = 0 ;
            for(int i = 0 ; i <word.length();i++){
                char ch = word.charAt(i);
                sum+= weights[ch-'a'];

            }
            sum %= 26 ;
            char x = (char) ('z'-sum);
            sb.append(x);
        }
        return sb.toString() ;
    }
}