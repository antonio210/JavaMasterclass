package coding.Section6_ControlFlow.exercises;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        int bigBags=bigCount*5;
        int smallBags=smallCount;


        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;

        }else if(bigBags + smallBags < goal){
            return false;
        }
        else {
            if(bigBags>=goal && goal%5==0){
                return true;
            }else if(bigBags+smallBags >=goal && (bigBags>goal && goal%5<=smallBags)||(bigBags<goal && goal-bigBags<=smallBags)){
                return true;
           /*}else if(bigBags+smallBags >=goal && ){
                return true;*/
            }else{
                return false;
            }

        }
    }
}