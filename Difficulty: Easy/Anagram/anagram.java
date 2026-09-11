class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        
        int[] str = new int[26];
        if(s1.length() != s2.length()) return false;
        else{
            for(int i = 0 ; i < s1.length(); i++){
                char ch = s1.charAt(i);
                str[ch - 'a']++;
                str[s2.charAt(i) - 'a']--;
            }
        }
        for(int i = 0 ; i < 26; i++){
            if(str[i] != 0) return false;
        }
        return true;
    }
}