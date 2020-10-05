package com.mikoto;

public class PrimeNumbers {

    private static boolean isPrime(int n) {

        if (n == 2 || n == 3 || n == 5) return true;

        if ((n - 1) % 6 != 0 && (n + 1) % 6 != 0) return false;

        for (int i = 3; i * i <= n; i++) if (n % i == 0) return false;

        return true;
    }

    public static void sieveOfEratosthenes(int n) {

        boolean[] prime = new boolean[n];
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i < n; i++) prime[i] = true;

        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i) prime[j] = false;
            }
        }

        for (int i = 2; i < n; i++) if (prime[i]) System.out.print(i + " ");
    }
}
