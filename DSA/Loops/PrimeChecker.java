import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        
        sc.close();
    }

    public static boolean isPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }
        
        // Check for divisibility from 2 up to the square root of n
        // We use Math.sqrt(n) because a larger factor must have a smaller counterpart
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        
        return true; // No divisors found, it is prime
    }
}