package assignment8.prob3;

import day10.Computer;

import java.util.Objects;

public class Marketing {
    private String  employeeName;
    private String productName;
    private int salesAmount;

    public Marketing(String employeeName, String productName, int salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString(){
        return "Marketing [employeeName=" + employeeName + " productName=" + productName +" salesAmount=" + salesAmount + "]";
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;

        Marketing campaign=(Marketing) obj;
        return salesAmount==campaign.salesAmount
                && Objects.equals(employeeName,campaign.employeeName)
                && Objects.equals(productName, campaign.productName);
    }

}
