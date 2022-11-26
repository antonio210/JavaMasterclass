package coding.Section6_ControlFlow.exercises;

public class NumberToWords {

    public static void main(String[] args) {
        //System.out.println("Reversed number is: "+reverse(1234)%10);
        numberToWords(-123);
        //System.out.println(getDigitCount(1230));
    }

    public static int reverse(int number){
        int reverse=0;
        int lastDigit=0;
        int temp=number;

        while(temp!=0){
            lastDigit=temp%10;
            reverse=(reverse*10)+lastDigit;
            temp=temp/10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        int length = 0;
        long temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
    }
        if(number==0){
            return 1;
        }else if(number<0){
            return -1;
        }
            else {
            return length;
        }
    }

    public static void numberToWords(int number){

        int reverseNum = reverse(number);
        int count=0;
        if(number<0){
            System.out.println("Invalid Value");
        }
          while (count<getDigitCount(number)){
              int temp = reverseNum%10;
          switch(temp){
                case 0:  System.out.println("Zero");
                    break;
                case 1:  System.out.println("One");
                    break;
                case 2:  System.out.println("Two");
                    break;
                case 3:  System.out.println("Three");
                    break;
                case 4:  System.out.println("Four");
                    break;
                case 5:  System.out.println("Five");
                    break;
                case 6:  System.out.println("Six");
                    break;
                case 7:  System.out.println("Seven");
                    break;
                case 8:  System.out.println("Eight");
                    break;
                case 9: System.out.println("Nine");
                    break;
          }
        count++;
        reverseNum/=10;
          }
    }
}
