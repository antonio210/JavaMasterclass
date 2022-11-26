package coding.Section6_ControlFlow.exercises;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        int lastDigit; int sum = 0;
        if(number<0){
            return -1;

        }else {
            while(number!=0){
                lastDigit=number%10;
                sum +=  ((lastDigit % 2 == 0) ? lastDigit : 0);
                number/=10;
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        System.out.println("Sum of even digits in number is " + getEvenDigitSum(12345678) );
    }
}
