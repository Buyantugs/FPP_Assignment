package day7prog2;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    private LocalDate hireDate;
    private int salary;

    public DeptEmployee(String name, LocalDate hireDate, int salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int computeSalary(){
        return salary;
    }
}
