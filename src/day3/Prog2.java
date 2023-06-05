package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Prog2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Please, enter your first name:");
        String firstName=reader.readLine();

        System.out.print("Please, enter your last name:");
        String lastName=reader.readLine();

        System.out.println("Please, enter birth date in the format-(yyyy-mm-dd)-Example 1989-04-14:");
        LocalDate birthday= LocalDate.parse(reader.readLine());

        /* input date format must be verify here but I unable to do it due to time constraint :P */

        HeartRates hr=new HeartRates(firstName, lastName, birthday);

        float[] rangeLowHighHR=hr.targetHeartRange(birthday);

        System.out.println("The Target Heart Rate Range is between "+rangeLowHighHR[0]+" and "+rangeLowHighHR[1]);
        System.out.println(hr.toString());

        /**
         * Sample output below when I input my personal data
         *
         * The Target Heart Rate Range is between 125.0 and 163.5
         * FirstName : Buyantugs
         * LastName : Luvsankhuu
         * Age : 40
         * Date of Birth: 1983-04-20
         * Maximum Heart Rate : 180
         */

    }
}
