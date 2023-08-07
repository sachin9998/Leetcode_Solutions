class Solution {
    public int findGCD(int[] nums) {
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            small = Math.min(small, nums[i]);
            large = Math.max(large, nums[i]);
        }

        return gcd(small, large);

    }

    public int gcd(int small, int large) {
        if(large == 0) {
            return small;
        }

        return gcd(large, small % large);
    }

}