package day8prog2;

public class Driver {
    public static void main(String[] args) {
        // Employee is abstract class so can not create
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Buyan", "Tugs", "ABC12345", 1000, 1.5, 100000);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Luvsan", "Khuu", "ABC98765", 2000, 1.5);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Purev", "Tuya", "ABC68754", 16.5, 100);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Sod", "Bileg", "ABC23456", 25000);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Amu", "Dari", "ABC123456", 35000);
        Employee[] e = new Employee[5];
        e[0] = basePlusCommissionEmployee;
        e[1] = commissionEmployee;
        e[2] = hourlyEmployee;
        e[3] = salariedEmployee;
        e[4] = salariedEmployee2;
        int totalSalary = 0;
        for (Employee em : e) {
            totalSalary += em.getPayment();
            System.out.println(em.toString());
        }
        System.out.println("Total salary="+totalSalary);
    }
}
