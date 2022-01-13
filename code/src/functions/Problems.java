package functions;

import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();

        boolean prime = isPrime(num);
        System.out.println(prime);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while ( c * c <= n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}