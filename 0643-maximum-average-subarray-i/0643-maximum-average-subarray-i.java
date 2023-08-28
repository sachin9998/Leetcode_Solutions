class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        // If the array has only one element, return the element itself as the maximum average
        if(nums.length == 1) {
            return (double) nums[0];
        }

        // Calculate the initial average of the first k elements
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Set the initial maximum average to the calculated average
        int maxSum = sum;

        int startIndex = 0;
        int endIndex = k;
        
        while(endIndex < nums.length) {

            // Slide the window and update sum
            sum -= nums[startIndex];
            startIndex++;

            sum += nums[endIndex];
            endIndex++;

            // Update maxSum by comparing with current subarray sum
            maxSum = Math.max(sum, maxSum);

        }

        // Return average of maximum contigous subarray
        return (double) maxSum / k;
    }
}