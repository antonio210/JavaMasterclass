package coding.Section6_ControlFlow.exercises;

public class SharedDigit {

    public static boolean hasSharedDigit(int no1, int no2) {


        if (no1 > 99 || no1 < 10 || no2 > 99 || no2 < 10) {
            return false;
        } else if (no1 % 10 == no2 % 10 || no1 % 10 == no2 / 10 || no1 / 10 == no2 / 10 || no1 / 10 == no2 % 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        if(hasSharedDigit(12,33)){
            System.out.println("Numbers have shared digit");
        }else
            System.out.println("Numbers DO NOT have shared digit");
    }

}
