class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int current = 0;

        for(int i = 0; i < nums.length; i++) {
            
            if(nums[i] == 1) {
                current++;
            }

            count = Math.max(current, count);

            if(nums[i] != 1) {
                current = 0;
            }
        }

        return count;
    }
}