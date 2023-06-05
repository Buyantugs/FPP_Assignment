//Day3-Problem – 1
package day3;

public class Prog1 {
    public static void main(String[] args) {

        Customer cust1=new Customer("Bold","Ganaa","AU83042015");
        Address cust1_billaddr=new Address("204 E Madision","Fairfield","IOWA","56553");
        Address cust1_shipaddr=new Address("204 E Madision","Fairfield","IOWA","56553");
        cust1.setBillingAddress(cust1_billaddr);
        cust1.setShippingAddress(cust1_shipaddr);


        Customer cust2=new Customer("Tsetseg","Dorjoo","AW09887722");
        Address cust2_billaddr=new Address("Jefferson","Chicago","Illinois","56550");
        Address cust2_shipaddr=new Address("Jefferson","Chicago","Illinois","56550");
        cust2.setBillingAddress(cust2_billaddr);
        cust2.setShippingAddress(cust2_shipaddr);

        Customer cust3=new Customer("Tsogtoo","Tushig","ZA98007756");
        Address cust3_billaddr=new Address("Adam","Fairfield","IOWA","56552");
        Address cust3_shipaddr=new Address("Adam","Fairfield","IOWA","56552");
        cust3.setBillingAddress(cust3_billaddr);
        cust3.setShippingAddress(cust3_shipaddr);

        Customer[] custArray=new Customer[3];
        custArray[0]=cust1;
        custArray[1]=cust2;
        custArray[2]=cust3;

        for(int i=0; i<custArray.length; i++)
        {
            if(custArray[i].getBillingAddress().city=="Chicago")
                System.out.println(custArray[i].toString());
        }

    }
}
