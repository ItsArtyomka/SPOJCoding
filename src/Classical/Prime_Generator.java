package Classical;

import java.util.Scanner;

public class Prime_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            // Primes Output
            printPrimesInRange(start, end);

            // Separate test cases with an empty line
            if (i < t - 1) {
                System.out.println();
            }
        }
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        // Not Prime
        if (num <= 1) {
            return false;
        }
        // Prime
        if (num <= 3) {
            return true;
        }

        // Not Prime
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        // 6k +- 1 Prime Check
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print prime numbers in the given range [start, end]
    private static void printPrimesInRange(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }
}
