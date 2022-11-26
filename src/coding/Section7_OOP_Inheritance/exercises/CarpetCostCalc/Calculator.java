package coding.Section7_OOP_Inheritance.exercises.CarpetCostCalc;

public class Calculator{
    private Floor floor;
    private Carpet carpet;

    public Calculator( Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return carpet.getCost()*floor.getArea();

    }

}
