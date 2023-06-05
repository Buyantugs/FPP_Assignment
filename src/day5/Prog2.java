package day5;
/**
 * Assignment 2 for day 5
 * Write a method to count the number of digits in an integer value n. Assume that n is
 * nonnegative and represented in base ten.
 * @author buyantugs
 * @since 06/02/2023
 */
public class Prog2 {
    public static void main(String[] args) {
        System.out.println(countDigit(12345));
    }
    public static int countDigit(int n){
        if(n<10){
            return 1; //base case
        } else {
            return 1+countDigit(n/10); //Recursion call
        }
    }

}
