package coding.exercises.firstSteps;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year){
        if(year>9999 || year<1){
            return false;
        }else if((year%4 ==0 && year%100 != 0)||year%400 == 0){
            return true;
        }else{
            return false;
        }
    }
}