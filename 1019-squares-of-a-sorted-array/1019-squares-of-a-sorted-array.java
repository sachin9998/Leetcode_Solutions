class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int ans[] = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        
        for(int i = nums.length - 1; i >= 0; i--) {

            if(Math.abs(nums[start]) < Math.abs(nums[end])) {
                ans[i] = Math.abs(nums[end]) * Math.abs(nums[end]);
                end--;
            } else{
                ans[i] = Math.abs(nums[start]) * Math.abs(nums[start]);
                start++;
            }
            
        }

        return ans;
    }
}