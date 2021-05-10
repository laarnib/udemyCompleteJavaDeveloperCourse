package com.edulaarni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int count = 1;

        while (count <= 10) {
            System.out.printf("Enter number #%d: ", count);
            boolean hasInt = scan.hasNextInt();
            if (hasInt) {
                number = scan.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid Number");
            }
            ++count;
            scan.nextLine();
        }

        System.out.printf("The sum is : %d%n", sum);
        scan.close();
    }
}
