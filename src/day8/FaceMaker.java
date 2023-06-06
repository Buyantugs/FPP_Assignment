package day8;

public class FaceMaker implements Figure{
    @Override
    public void getFigure() {
        System.out.print(":)");
    }

    @Override
    public void getFigureWithName() {
        System.out.println("FaceMaker : :)");
    }
}
