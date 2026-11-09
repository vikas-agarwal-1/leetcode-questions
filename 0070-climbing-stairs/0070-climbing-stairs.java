class Solution {
    public int climbStairs(int n) {
        int a =1, b=2;

        if(n==1 || n==2) {
            return n;
        }
        for(int i=3; i<=n; i++) {
            int c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
}