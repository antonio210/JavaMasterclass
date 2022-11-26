package coding.FirstSteps;

public class Challenge {


    public static void main(String[] args) {
        double firstDouble = 20d;
        double secondDouble = 80d;

        double restultDouble = (firstDouble+secondDouble)*100;
        System.out.println("resultDouble = "+restultDouble);
        double remainder = restultDouble%40;
        System.out.println("remainder = "+ remainder);


        boolean temp = (remainder != 0) ? true : false;

        if(temp){
            System.out.println("Got some remainder");
        }else{
            System.out.println("Remainder is zero");
        }



    }



}
