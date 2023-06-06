package day8;
public class Driver {
    public static void main(String[] args) {

        Figure[] obj={new UpwardHat(), new UpwardHat(), new DownwardHat(), new FaceMaker(), new Vertical()};
        for(Figure f:obj){
            f.getFigure();
        }

        System.out.println("\n");

        for(Figure f:obj){
            f.getFigureWithName();
        }

    }
}
