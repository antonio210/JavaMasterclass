package coding.Section7_OOP_Inheritance.exercises.Cylinder;

import java.lang.Math;

public class Circle {

    private double radius;


    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

        public double getArea(){
            return Math.pow(radius,2) * Math.PI;
        }


    }
