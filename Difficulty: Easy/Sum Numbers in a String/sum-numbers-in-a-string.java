class Solution {
    public static int findSum(String s) {
        // code here
        int sum = 0, currentNumber = 0;
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                currentNumber = currentNumber * 10 + Character.getNumericValue(ch);
            }else{
                sum += currentNumber;
                currentNumber = 0;
            }
        }
        sum += currentNumber;
        return sum;
    }
}