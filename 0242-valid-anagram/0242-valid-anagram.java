class Solution {
    public boolean isAnagram(String s, String t) {
        char []arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if(arr.length!=arr2.length) return false ;
        String st = new String(arr); 
        String st2 = new String(arr2); 
        if(st.equals(st2)){
            return true ;
        }
        return false ;

    }
}