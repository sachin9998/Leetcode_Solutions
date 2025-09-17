class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet <Integer> set = new LinkedHashSet<>();

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int index = 0;
        for(int x : set) {
            nums[index++] = x;
        }

        return set.size();
    }
}