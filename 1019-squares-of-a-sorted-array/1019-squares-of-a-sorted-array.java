class Solution {
    public int[] sortedSquares(int[] nums) {

        int ans[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                ans[i] = Math.abs(nums[i]) * Math.abs(nums[i]);
            }
            else
                ans[i] = nums[i] * nums[i];
        }

        Arrays.sort(ans);
        return ans; 
    }
}