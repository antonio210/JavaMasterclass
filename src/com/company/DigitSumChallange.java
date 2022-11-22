package com.company;

public class DigitSumChallange {

    public static int sumDigits(int n){
        int sum=0;
        int lastDigit=0;
        if(n>=10){
            while(n>0){
                lastDigit=n%10;
                sum+=lastDigit;
                n/=10;
            }
            return sum;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sum is "+sumDigits(32123));
    }

}
