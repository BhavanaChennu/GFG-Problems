class Solution {
    public int maxWater(int arr[]) {
        // code here
        int left = 0 , right = arr.length-1 , totalWater = 0;
        int leftMax = arr[left] , rightMax = arr[right];
        while(left < right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax , arr[left]);
                totalWater += leftMax - arr[left];
            }
            else{
                right--;
                rightMax = Math.max(rightMax , arr[right]);
                totalWater += rightMax - arr[right];
            }
        }
        return totalWater;
    }
}
