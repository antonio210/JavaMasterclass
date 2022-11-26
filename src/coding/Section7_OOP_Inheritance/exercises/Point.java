package coding.Section7_OOP_Inheritance.exercises;

public class Point {
    private int x;
    private int y;


    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double distance(){
        int ax=this.x;
        int ay=this.y;
        return Math.sqrt((0-x)*(0-x)+(0-y)*(0-y));
    }

    public double distance(int x, int y){
        int ax=getX();
        int ay=getY();
        int bx=x;
        int by=y;
        return Math.sqrt((bx-ax)*(bx-ax)+(by-ay)*(by-ay));
    }

    public double distance(Point second){
        int ax=this.x;
        int ay=this.y;
        int bx=second.getX();
        int by=second.getY();
        return Math.sqrt((bx-ax)*(bx-ax)+(by-ay)*(by-ay));
    }

}

