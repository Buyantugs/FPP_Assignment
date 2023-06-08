package day10;

/**
 * Day – 3
 * Problem : 5
 * @author Buyantugs
 */
public class Main {
    public static void main(String[] args) {
        Computer c1=new Computer("HP","Intel core i7",16,1200);
        Computer c2=new Computer("HP","Intel core i7",16,1200);
        Computer c3=new Computer("Dell","Intel core i5",8,1400);
        Computer[] c_arr=new Computer[3];
        c_arr[0]=c1;
        c_arr[1]=c2;
        c_arr[2]=c3;

        if(c1.equals(c2)) System.out.println("The computer spec equal");
        else System.out.println("The computer spec not equal");

        if(c1.equals(c3)) System.out.println("The computer spec equal");
        else System.out.println("The computer spec not equal");

        for(Computer c:c_arr){
            System.out.println(c.toString()+ " hashCode:"+c.hashCode());
        }
    }
}
