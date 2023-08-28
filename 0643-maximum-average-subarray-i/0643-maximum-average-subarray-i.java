class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 1) {
            return (double) nums[0];
        }

        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Sliding 
        int startIndex = 0;
        int endIndex = k;
        
        while(endIndex < nums.length) {

            // Remmoove 
            sum -= nums[startIndex];
            startIndex++;

            sum += nums[endIndex];
            endIndex++;

            maxSum = Math.max(sum, maxSum);

        }

        return (double) maxSum / k;

    }
}