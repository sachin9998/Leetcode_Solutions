class Solution {
    public int countPrimes(int n) {

        if(n == 0 || n == 1) {
            return 0;
        }

        boolean isPrime[] = new boolean[n];
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i * i <= n; i++) {
            if(isPrime[i]) {
                for(int j = i * 2; j < n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i = 2; i < n; i++) {
            if(isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}