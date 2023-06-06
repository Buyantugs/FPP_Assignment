package day7prog2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) throws IOException {
        Professor p1=new Professor("Buyan",LocalDate.of(2016, 9, 23),90000,5);
        Professor p2=new Professor("Tugs", LocalDate.of(2021, 3, 7),120000,10);
        Professor p3=new Professor("Tuya", LocalDate.of(2022, 12, 31),100000,3);
        Secretary s1=new Secretary("Saraa",LocalDate.of(2016, 9, 23),85000,10);
        Secretary s2=new Secretary("Baraa",LocalDate.of(2022, 9, 23),95000,2);

        DeptEmployee[] department = new DeptEmployee[5];
        department[0]=p1;
        department[1]=p2;
        department[2]=p3;
        department[3]=s1;
        department[4]=s2;

        System.out.println("Do you wishes to see the sum of all Professor and Secretary? if yes, please press \"Y\"");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Reading data using readLine
        String name = reader.readLine();

        long totalSalary=0;

        if (name=="Y"){
            for (DeptEmployee dpt:department) {
                totalSalary+= dpt.computeSalary();
            }
        }
        // Printing the read line
        System.out.println("Total salary is="+totalSalary);

    }
}
