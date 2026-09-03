class Solution {
    public int[] findSum(int n) {
        // Code here
        int evenSum = 0 , oddSum = 0;
        for(int i = 1; i <= n ; i++){
            if(i % 2 == 0)  evenSum += i;
            else oddSum += i;
        }
        return new int[]{oddSum, evenSum};
    }
}