package day5;

/**
 * Assignment 3 for day 5
 * Write a method to compute the sum of all elements of the array arr, of size n.
 */
public class Prog3 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int sum=computeSum(arr, arr.length);
        System.out.println("Sum:"+sum);
    }

    public static int computeSum(int[] arr, int n){
         if (n==0){
            return 0; //base case
        }else{
           int sum=computeSum(arr, n-1); //Recursion call with smaller subarray
           sum=sum+arr[n-1]; //Add last element to the sum
            return sum;
        }
    }

}
