class Solution {

    public void swap(int[] nums, int start, int end) {
        while(start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }


    public void rotate(int[] nums, int k) {
        // 7 6 5 4 3 2 1
        // 5 6 7 1 2 3 4

        k = k % nums.length;

        swap(nums, 0, nums.length - 1);
        swap(nums, 0, k - 1);
        swap(nums, k, nums.length - 1 );


    }
}