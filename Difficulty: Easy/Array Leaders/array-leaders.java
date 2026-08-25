import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int leaders = arr[n-1];  
        list.add(leaders);
        for( int i = (n - 2) ; i >= 0; i--){
            if( arr[i] >= leaders){
                leaders = arr[i];
                list.add(leaders);
            }
            
        }
        Collections.reverse(list);
        return list;
    }
}
