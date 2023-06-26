package math.utility;

import java.util.Scanner;
public class FindPower {
    public static int calculatePower(int base, int exponent) {
        if(exponent<0)
            throw new IllegalArgumentException();
        int result = 1;
        for (int i = 1; i<=exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and exponent");
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        System.out.println(base + " raised to the power of "+ exponent + " is " + calculatePower(base,exponent));
    }
}
