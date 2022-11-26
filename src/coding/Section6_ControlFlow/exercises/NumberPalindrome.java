package coding.Section6_ControlFlow.exercises;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int reverse=0;
        int lastDigit=0;
        int temp=number;

        while(temp!=0){
            lastDigit=temp%10;
            reverse=(reverse*10)+lastDigit;
            temp=temp/10;
        }
        System.out.println(reverse + " = " + number );
        if(number == reverse){
            return true;

        }else{
            return false;
        }

    }




    public static void main(String[] args) {
    isPalindrome(12321);
    }

}