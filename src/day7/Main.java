package day7;

/**
 * Create a main class to test the application to perform the below tasks
 * a. Create an array of Shape[] to hold at-least five objects for its subtypes.
 * b. Create a Static method to print the total area of all the Shape objects and print the
 * total perimeter of all the Shape objects.
 * public static void printTotal(Shape[] shapes)
 *  { // Implement your code
 */
public class Main {

        public static void printTotal(Shape[] obj)
        {
            double totalArea=0, totalPerimeter=0;

            for (Shape shape : obj) {
                totalArea+=shape.CalculateArea();
                totalPerimeter+=shape.calculatePerimeter();
            }
            System.out.println("Rectangle Area="+totalArea);
            System.out.println("Perimeter of Rectangle="+totalPerimeter);

        }

    public static void main(String[] args) {

        Shape[] obj=new Shape[5];
        obj[0]=new Rectange("BLACK", 5,10);
        obj[1]=new Circle("RED",11);
        obj[2]=new Square("PURPLE",5);
        obj[3]=new Rectange("BLACK", 3,6);
        obj[4]=new Square("GREY",20);

        printTotal(obj);
    }

}
