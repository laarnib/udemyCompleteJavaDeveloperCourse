package com.edulaarni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int number = 0;
        int loopCount = 1;  // track if this is first pass in the loop

        while(true) {
            System.out.print("Enter number: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                number = scanner.nextInt();

                // If first pass in the loop, copy value of number to both min and max
                if (loopCount == 1) {
                    min = number;
                    max = number;
                } else {
                    if (number < min) {
                        min = number;
                    } else if (number > max){
                        max = number;
                    }
                }
            } else {
                break;
            }
            ++loopCount;
        }
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
        scanner.close();
    }
 }

 /* Instructor's solution
 - setting min to the minimum value that an integer variable can hold
 - setting max to the maximum value that an integer variable can hold

 min = -2147483648;
 max = 2147483647;

 Or using Java constants for integer's minimum and maximum values

 min = Integer.MIN_VALUE;
 max = Integer.MAX_VALUE;
  */