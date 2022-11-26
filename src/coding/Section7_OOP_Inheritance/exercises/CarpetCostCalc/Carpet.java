package coding.Section7_OOP_Inheritance.exercises.CarpetCostCalc;

public class Carpet{

    private double cost;

    public Carpet(double cost){
        if(cost < 0){
            this.cost = 0;
        }else{
            this.cost = cost;
        }

    }

    public double getCost(){
        return cost;
    }
}
