package day8;

public class Vertical implements  Figure{
    @Override
    public void getFigure() {
        System.out.print("||");
    }

    @Override
    public void getFigureWithName() {
        System.out.println("Vertical : ||");
    }
}
