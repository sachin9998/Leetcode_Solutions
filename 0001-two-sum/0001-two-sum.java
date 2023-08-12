class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map < Integer, Integer> numMap = new HashMap <>();

        // Building the Hash Table
        for(int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Finding the complement
        for(int i = 0; i < n; i++) {

            int diff = target - nums[i];

            if(numMap.containsKey(diff) && numMap.get(diff) != i) {
                return new int[]{i, numMap.get(diff)};
            }

        }
        
        return new int[]{}; // No Solution Found
    }
}