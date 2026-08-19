class Solution {
    double power(double b, int e) {
        // code here
                if(b==0){
                    return 0.00;
                }else if(e==0){
                    return 1.00;
                }
                return Math.pow(b,e);
    }
}