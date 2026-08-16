class Solution {
    public String isAutomorphic(int n) {
        // code here
        long square = n * n;
        boolean isAutomorphic = true;
        while(n > 0){
            if( n % 10 != square % 10 ){
                isAutomorphic = false;
                break;
            }
            n = n/10;
            square = square / 10;
        }
        if(isAutomorphic)  return "Automorphic";
         
        return "Not Automorphic";
    }
}