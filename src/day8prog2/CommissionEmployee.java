package day8prog2;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales, double commissionRate)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    double getPayment() {
        return grossSales*commissionRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName=" + getFirstName() +" "+
                "lastName=" + getLastName() +" "+
                "socialSecurityNumber="+getSocialSecurityNumber()+" "+
                "grossSales="+getGrossSales()+" "+
                "commisionRate="+getCommissionRate()+" "+
                '}';
    }
}
