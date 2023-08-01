class Solution {
    public int countPrimes(int n) {

        // Base Cases
        if(n == 1 || n == 0) {
            return 0;
        }
        
        boolean prime[] = new boolean[n+1];
        
        for(int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }
        
        prime[0] = false;
        prime[1] = false;

        int count = 0;

        for(int i = 2; i < n; i++) {
            if(prime[i]) {
                count++;

                for(int j = i * 2; j < n; j = j + i) {
                    prime[j] = false;
                }

            }
        }

        return count;
    }
}