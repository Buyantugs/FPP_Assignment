package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog3 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Please, enter a letter of C,R or T:");
        String input= null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (input.equals("R")) {

            System.out.print("Enter the width of the Rectangle:");
            double w= 0;
            try {
                w = Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.print("Enter the length of the Rectangle:");
            double l= 0;
            try {
                l = Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Rectangle rec = new Rectangle(w,l);
            System.out.println("The area of Rectangle is : "+rec.computeArea());

        } else if (input.equals("T")) {
            System.out.print("Enter the base of the Triangle:");
            double w= 0;
            try {
                w = Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.print("Enter the height of the Triangle:");
            double l= 0;
            try {
                l = Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Triangle rec = new Triangle(w,l);
            System.out.println("The area of Triangle is : "+rec.computeArea());
        } else if (input.equals("C")) {
            System.out.print("Enter the radius of the Circle:");
            double r= 0;
            try {
                r = Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Circle rec = new Circle(r);
            System.out.println("The area of Circle is : "+rec.computeArea());
        } else System.out.println("Please enter one of letter of C,T or R");
    }
}
