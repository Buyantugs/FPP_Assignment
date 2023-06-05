package day7;

/**
 * Perform the following tasks
 * a. The return value of calcualteArea() & calculatePerimeter() is double.
 * b. Don’t provide any getter or setters, make all the fields as either default or protected.
 * c. In the Shape class just return 0.0 for the calcualteArea() & calculatePerimeter().
 * d. Square class has no attribute. Assign the passed side value to height and width attribute of
 * its super class Rectangle. Because four sides are same in the Square. No need to
 * implement calcualteArea() & calculatePerimeter() inside Square class. You have to make
 * use Rectangle class calcualteArea() & calculatePerimeter(). Because you pass height and
 * width as same value.
 *
 * @author Buyatugs
 * @since 06/05/2023
 * @place Library
 */
public class Shape {
    String color;
    Shape(String color){
        this.color=color;
    }
    public double CalculateArea(){
        return 0.0;
    }
    public double calculatePerimeter(){
        return 0.0;
    }
}
