package coding.exercises.controlFlowStatements;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        int sum=0;
        if(number<0){
            return -1;

        }
        else if(number<10) {
        return number*2;
        }else
        {
            sum+=number%10;
            while(number>=10){
                number/=10;
            }
            sum+=number;
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println( "Sum of first and last digit is " + sumFirstAndLastDigit(10));
    }
}
