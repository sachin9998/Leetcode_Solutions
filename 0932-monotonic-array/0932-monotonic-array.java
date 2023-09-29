class Solution {
    public boolean isMonotonic(int[] nums) { 
        
        boolean ans = isAscending(nums) || isDescending(nums);
        return ans;
    }

    public boolean isAscending(int arr[]) {
        boolean ans = true;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return ans;
    }

    public boolean isDescending(int arr[]) {
        boolean ans = true;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i + 1]) {
                return false;
            }
        }

        return ans;
    }

}