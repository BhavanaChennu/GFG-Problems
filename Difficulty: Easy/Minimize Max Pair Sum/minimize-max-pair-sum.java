class Solution {
    public int pairMinimum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int left = 0 , right = arr.length-1;
        int sum = 0, max = 0;
        while(left < right){
            sum = arr[left]+arr[right];
            max = Math.max(max,sum);
            left++ ; right--;
        }
        return max;
    }
}
