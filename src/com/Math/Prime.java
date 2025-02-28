package Math;

public class Prime {
    public static void main(String[] args) {
        int n = 40 ;
       boolean[] primes = new boolean[n+1];

        long start = System.currentTimeMillis();
//        for (int i = 2; i <=n; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
       sieve(n,primes);
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println(end- start);
    }
//    public static boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
    public static void sieve(int n , boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
