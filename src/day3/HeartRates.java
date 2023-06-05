//Day3-Problem – 2

package day3;
import java.time.LocalDate;
import java.time.Period;
public class HeartRates {
    String firstName;
    String lastName;
    LocalDate birthday;

    public HeartRates(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int ageOfPerson(LocalDate birthday){
        AgeCalculator ag=new AgeCalculator();
        return ag.calculateAge(birthday).getYears();
    }

    public int maxHearRate(LocalDate birthday){
        AgeCalculator ag=new AgeCalculator();
        return 220-ag.calculateAge(birthday).getYears();
    }

    public float[] targetHeartRange(LocalDate birthday){

        /**
         * [Formula: To Calculate Target heart rate range is mentioned below ]
         * a. Assign Resting Heart Rate (RHR) = 70. (Assign as a Constant)
         * b. Assign Maximum Heart Rate (MHR) = 220 – age.
         * c. Calculate Average Heart Rate (AHR) = MHR – RHR.
         * d. Assign Lower Boundary(LB) = 0.5 (Assign as a Constant)
         * e. Assign Upper Boundary(UB) = 0.85. (Assign as a Constant)
         * f. Calculate Lower Boundary Target Heart Rate (LBTHR)= (AHR*LB) + RHR,
         * g. Calculate Upper Boundary Target Heart Rate (UBTHR) = (AHR*UB) + RHR
         * h. The Result of Target Heart Rate Range is between LBTHR and UBTHR
         */

        final int RHR=70;
        int MHR=220-ageOfPerson(birthday);
        int AHR=MHR-RHR;
        final float LB=0.5F;
        final float UB=0.85F;
        float LBTHR=(AHR*LB)+RHR;
        float UBTHR=(AHR*UB)+RHR;

        float[] result=new float[2];
        result[0]=LBTHR;
        result[1]=UBTHR;

        return result;
    }

    public String toString() {
        return "FirstName : " + this.firstName +"\n"+ "LastName : " + this.lastName +"\n"+ "Age : "
                +ageOfPerson(this.birthday)+"\n"+ "Date of Birth: " + this.birthday +"\n"+ "Maximum Heart Rate : "+maxHearRate(this.birthday);
    }

}
