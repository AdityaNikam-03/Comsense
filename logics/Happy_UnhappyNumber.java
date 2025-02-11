package com.tbc.logics;

import java.util.HashSet;
import java.util.Scanner;

public class Happy_UnhappyNumber {
    
    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static boolean isHappyNumber(int num) {
        HashSet<Integer> seen = new HashSet<>();
        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            num = sumOfSquares(num);
        }
        return num == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        if (isHappyNumber(num)) {
            System.out.println(num + " is a Happy Number!");
        } else {
            System.out.println(num + " is an Unhappy Number.");
        }
    }
}
