class Solution {
    public static int[] lcmAndGcd(int m, int n) {
        int ans1= gcd(m,n);
        int ans2= lcm(m,n);
        int res[]=new int[2];
        res[0] = ans2;
        res[1] = ans1;
        return res;
    }
    static int gcd(int m, int n){
        while(m != n){
            if(m > n) m = m - n;
            else n = n - m;
        }
        return m;
    }
    static int lcm(int m, int n){
        return (m * n) / gcd(m, n);
    }
}