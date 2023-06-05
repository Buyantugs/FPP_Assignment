package day7;

public class Circle extends Shape {
    double radius;
    Circle(String color, double radius){
        super(color);
        this.radius=radius;
    }


    public double CalculateArea(){
        return Math.PI*radius*radius;
    }

    public double calculatePerimeter(){
        return Math.PI*2*radius;
    }
}
