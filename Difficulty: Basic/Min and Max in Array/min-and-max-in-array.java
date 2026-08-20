class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0] , max = arr[0];
        for( int i = 1 ; i < arr.length; i++){
            if(arr[i] > max) 
                 max = arr[i];
            else if(arr[i] < min)
                 min = arr[i];
        }
        list.add(min);
        list.add(max);
        return list;
    }
}
