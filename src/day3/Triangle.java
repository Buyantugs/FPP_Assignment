package day3;
final public class Triangle {
    private final double base;
    private final double height;

    public Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    public double computeArea(){
        double v = 1 / 2 * base * height;
        return v;
    }
}
