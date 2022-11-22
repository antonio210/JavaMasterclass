package com.company;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true){
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if( isAnInt){
                int number = scanner.nextInt();
                max = number > max ? number : max;
                min = number < min ? number : min;
            }else{
                System.out.println("Invalid input");
                break;
            }

            scanner.nextLine();

        }
        scanner.close();

        System.out.println("Minimal value was: " + min);
        System.out.println("Maximal value was: " + max);



    }

}
