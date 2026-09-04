import java.util.*;

class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
    
        int i = 0, j = 1;
        while(j < arr.length){
            if( arr[i] == arr[j])  j++;
            else{
                i++;
                arr[i] = arr[j];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int k = 0; k <= i; k++){
            list.add(arr[k]);
        }
        return list;
    }
}