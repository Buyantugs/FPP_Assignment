package day7prog2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    private double overTime;
    public Secretary(String name, LocalDate hireDate, int salary, double overTime){
        super(name, hireDate, salary);
        this.overTime=overTime;
    }

    public void setOverTime(double overTime){
        this.overTime=overTime;
    }
    public double getOverTime(){
        return overTime;
    }

    @Override
    public int computeSalary() {
        return super.computeSalary()*12;
    }
}
