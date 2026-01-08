class Solution {
    public boolean isHappy(int n) {
       Set<Integer> set =  new HashSet<>();
       while(!set.contains(n)){
        set.add(n);
        n = getNumber(n);
        if(n==1) return true ;

       }
       return false; 
    }
    private int getNumber(int n ){
         int sum = 0 ;
        int temp = n ;
        while(temp>0){
            int rem = temp%10 ;
            sum+= rem*rem ;
            temp/=10 ;
        }
        return sum ;
    }
}