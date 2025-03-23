class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer> hm = new HashMap<>();


        for(int i = 0; i < n; i++) {
            int diff = target - nums[i];

            if(hm.containsKey(diff) && hm.get(diff) != i) {
                return new int[]{i, hm.get(diff)};
            }

            hm.put(nums[i], i);
        }

        return new int[]{};
    }
}