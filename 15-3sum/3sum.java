class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        Set<List<Integer>> ans = new HashSet<>();

        for(int i = 0; i < n - 2; i++) {
            int start = i + 1;
            int end = n - 1;

            while(start < end) {
               int count = nums[i] + nums[start] + nums[end];
                if(count == 0) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[start]);
                    triplet.add(nums[end]);
                    ans.add(triplet);
                    start++;
                    end--;
                } else if (count > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        ArrayList<List<Integer>> result= new ArrayList<>(ans);
        return result;
    }
}