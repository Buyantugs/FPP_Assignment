package day4;

public class Operation {
    int data=50;
    void change(Operation op){
        op.data=op.data+100; //change will be in the instance variable
    }

    public static void main(String[] args) {
        Operation op=new Operation();

        System.out.println("Before change "+op.data);
        op.change(op);
        System.out.printf("After change "+op.data);
    }
}
