class Solution {
    public int maximumWealth(int[][] accounts) {

        int max = 0;
        
        for(int i = 0; i < accounts.length; i++) {
            int count = 0;

            for(int j = 0; j < accounts[i].length; j++) {
                count = accounts[i][j] + count;
            } 

            if(count > max) {
                max = count;
            }

        }

        return max;
        
    }
}