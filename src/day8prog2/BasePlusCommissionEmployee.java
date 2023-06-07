package day8prog2;
public class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    double getPayment() {
        return baseSalary+super.getPayment();
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "firstName=" + getFirstName() +" "+
                "lastName=" + getLastName() +" "+
                "socialSecurityNumber="+getSocialSecurityNumber()+" "+
                "grossSales="+getGrossSales()+" "+
                "commissionRate="+getCommissionRate()+" "+
                "baseSalary="+getBaseSalary()+
                '}';
    }
}
