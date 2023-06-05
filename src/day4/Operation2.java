package day4;

public class Operation2 {
    int data=50;
    void change(int data){
        data=data+100; //change will be in the local variable only
    }

    public static void main(String[] args) {
        Operation2 op=new Operation2();

        System.out.println("Before change "+op.data);
        op.change(500);
        System.out.printf("After change "+op.data);
    }
}
