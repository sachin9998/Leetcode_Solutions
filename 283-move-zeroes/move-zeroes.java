class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int ans[] = new int[nums.length];
        int index = n - 1;
        int curr = 0;

        for(int i = 0; i < n; i++) {

            if(nums[i] == 0) {
                ans[index] = 0;
                index--;
            } else{
                ans[curr] = nums[i];
                curr++;
            }

        }

        for(int i = 0; i < n; i++) {
            nums[i] = ans[i];
        }
    }
}