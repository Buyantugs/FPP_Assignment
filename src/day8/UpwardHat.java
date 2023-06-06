package day8;

final class UpwardHat implements Figure {
    UpwardHat(){};

    @Override
    public void getFigure() {
        System.out.print("/\\");
    }

    @Override
    public void getFigureWithName() {
        System.out.println("UpwardHat : /\\");
    }
}
