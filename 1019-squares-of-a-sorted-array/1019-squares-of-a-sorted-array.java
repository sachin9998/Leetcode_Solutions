class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int ans[] = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        int index = end;

        while(start <= end) {
            
            if(Math.abs(nums[start]) < Math.abs(nums[end])) {
                ans[index--] = Math.abs(nums[end]) * Math.abs(nums[end]);
                end--;
            } else{
                ans[index--] = Math.abs(nums[start]) * Math.abs(nums[start]);
                start++;
            }

        }
        
        

        return ans;
    }
}