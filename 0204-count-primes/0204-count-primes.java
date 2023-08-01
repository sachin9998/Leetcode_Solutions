class Solution {
    public int countPrimes(int n) {

        // Base Cases
        if(n == 1 || n == 0) {
            return 0;
        }
        
        // Creating array of boolean assumming all numbers are prime
        boolean prime[] = new boolean[n];
        
        for(int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }
        
        // Marking 0 & 1 as false;
        prime[0] = false;
        prime[1] = false;

        int count = 0;

        // Checking if prime[i] is true (means prime) then marking every number from this prime number as false(means they are not prime).
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