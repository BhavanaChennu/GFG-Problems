class Solution {
    public int[] evenOddSum(int[] arr) {
        // code here
        int evenSum = 0, oddSum = 0;
        for(int i = 0; i < arr.length; i++){
            if( i % 2 == 0)  oddSum += arr[i];
            else evenSum += arr[i];
        }
        return new int[]{evenSum , oddSum};
    }
}