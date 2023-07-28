class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;

        for(int x : nums) {

            int digitsCount = (int) (Math.log10(x)) + 1;
            boolean isEven = false;

            if(digitsCount % 2 == 0) {
                isEven = true;
            }

            if(isEven) {
                count++;
            }

        }
        return count;
    }
}