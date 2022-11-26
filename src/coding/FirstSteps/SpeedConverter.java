package coding.FirstSteps;

public class SpeedConverter {

public static long toMilesPerHour(double kilometersPerHour){
    if(kilometersPerHour >= 0){
     long miles= Math.round(kilometersPerHour/1.609);
     return miles;
    }
    return -1;
}

public static void printConversion(double kilometersPerHour){
    if(kilometersPerHour >= 0){
        System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");

    }else{
        System.out.println("Invalid Value");
    }

}

    public static void main(String[] args) {
    toMilesPerHour(1.25);
    printConversion(1.25);
    //printConversion(1.25);

/*        for(double x=0.5;x<2;x+=0.15){
            System.out.println(x+" = "+Math.round(x));
        };*/
    }

}
