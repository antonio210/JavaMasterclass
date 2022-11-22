package coding.exercises.controlFlowStatements;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while(scanner.hasNextInt()){

                       int number = scanner.nextInt();
                       sum+=number;
                       counter++;
        }
        long average = sum/counter;

        System.out.println("SUM = "+sum+" AVG = "+ Math.round(average));
    }
    public static void main(String[] args) {
    inputThenPrintSumAndAverage();
    }
}


