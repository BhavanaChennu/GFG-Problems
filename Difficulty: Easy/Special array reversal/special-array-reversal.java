class Solution {
    public String reverse(String str) {
        // complete the function here
        char[] ch = str.toCharArray();
        int left = 0 , right = str.length()-1;
        while(left < right){
            if(!Character.isLetter(ch[left])) left++;
            else if(!Character.isLetter(ch[right])) right--;
            else{
                if( Character.isLetter(ch[left]) && Character.isLetter(ch[right])){
                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;
                    left++ ;
                    right--;
                }
            }
        }
        return String.valueOf(ch);
    }
}