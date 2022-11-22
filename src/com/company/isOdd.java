package com.company;

public class isOdd {

    public static boolean isOdd( int number){
        if(number<1 || number % 2 ==0){
            return false;
        }else{
            return true;
        }
    }

    public static int sumOdd (int start, int end) {
        int sum = 0;
        if (start > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if(isOdd(i)){
                    sum+=i;
                }
            }
            return sum;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sum = "+ sumOdd(-1,100));
    }
}
