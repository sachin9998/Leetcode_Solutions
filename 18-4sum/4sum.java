class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {     
        int n = nums.length;
        // Sort the given array
        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();
        // Fix the first two elements and find the other two elements using two-pointer approach
        for(int i = 0; i < n - 3; i++) {    
            for(int j = i + 1; j < n - 2; j++) {

                int start = j + 1;
                int end = n - 1;

                while(start < end) {
                    long sum =  (long) nums[i] + nums[j] + nums[start] + nums[end];
                    if(sum == target) {        
                        // Add the quadruplet in result and continue     
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[start]);
                        quad.add(nums[j]);
                        quad.add(nums[end]);
                        result.add(quad);
                        start++;
                        end--;
                    } 
                    else if(sum < target) {
                        start++;
                    } else {
                        end--;
                    }

                }
            }
        }

        // Convert HashSet into ArrayList and return it as the answer
        List<List<Integer>> list = new ArrayList<>(result);
        return list;
    }
}