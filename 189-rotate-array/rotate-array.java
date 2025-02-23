class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        int ans[] = new int[n];

				// To avoid negative or rotations more than array length
        k = k % n;
        
        int start = 0;
        for(int i = n - k; i < n; i++) {
            ans[start] = nums[i];
            start++;
        }

        for(int i = 0; i < n - k; i++) {
            ans[start] = nums[i];
            start++;
        }

        for(int j = 0; j < n; j++) {
            nums[j] = ans[j];
        }

    }
}
