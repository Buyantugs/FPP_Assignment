package day7;
public class Rectange extends Shape {
    double width;
    double height;

    public Rectange(String color, double width, double height){
        super(color);
        this.width=width;
        this.height=height;
    }

    public double CalculateArea(){
        return width*height;
    }

    public double calculatePerimeter(){
        return 2*width+2*height;
    }

}
