class Solution {
    public int totalWaviness(int num1, int num2) {
        int sum = 0 ;
       
        for (int n = num1; n <= num2; n++) {
           sum += waviness(n);
        }
        return sum;
    }

    private int waviness(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        if (len < 3) return 0;

        int count = 0;
        for (int i = 1; i < len - 1; i++) {
            int a = s.charAt(i - 1) - '0';
            int b = s.charAt(i) - '0';
            int c = s.charAt(i + 1) - '0';
            
            if ((b > a && b > c) || (b < a && b < c)) {
                count++;
            }
        }
        return count;
    }
}