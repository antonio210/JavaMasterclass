package coding.FirstSteps;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int megaBytes= Math.round(kiloBytes/1024);
        int remaining= kiloBytes%1024;
        if(kiloBytes>=0) {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remaining + " KB");
        }else{
            System.out.println("Invalid Value");
        }
    }

}
