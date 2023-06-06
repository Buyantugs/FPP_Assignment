package day8prog2;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    double getPayment(){
        return weeklySalary;
    }

    @Override
    public String toString() {
         return "SalariedEmployee{" +
                    "firstName=" + getFirstName() +" "+
                    "lastName=" + getLastName() +" "+
                    "socialSecurityNumber="+getSocialSecurityNumber()+" "+
                    "weeklySalary="+getWeeklySalary()+
                    '}';

    }
}
