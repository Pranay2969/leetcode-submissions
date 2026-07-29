class Solution {
    public int countPrimes(int n) {
        if(n < 2) return 0;
        boolean[] primes = new boolean[n+1];

        primes[0] = true;
        primes[1] = true;

        for(int i = 2; i*i < n; i++) {
            if(!primes[i]) {
                for(int j = i * i; j < n; j += i) {
                    primes[j] = true;
                }
            }
        }

        int count = 0;
        for(int i = 2; i < n; i++) {
            if(!primes[i])
                count++;
        }

        return count;
    }
}