package day4;
/**
 * 2. Write a class that has 2 instance fields, 1 static field, 2 instance methods,2 static methods,
 * 2 instance initialization block, 2 static initialization block, and 2 constructors.
 * Create a Main class and inside the main method create 2 objects of the class using the different constructor methods.
 * In each method and blocks print some string to console and explain the program execution order.
 */
public class Prog2 {
    //2 instance fields
    String instanceField1;
    String instanceField2;
    //1 static field
    static int staticField;
    //2 instance methods
    public void add(){
        System.out.println("instance method 1: add");
    }
    public void minus(){
        System.out.println("instance method 2: minus");
    }
    //2 static methods
    public static void divide(){
        System.out.println("static method 1: divide");
    }
    public static void multiply(){
        System.out.println("static method 2: multiply");
    }
    //2 instance initialization block,
    {
        instanceField1 = "1st initializer block";
        System.out.println("instance initialization block1: "+instanceField1);
    }
    {
        instanceField2 = "2nd initializer block";
        System.out.println("instance initialization block2: "+instanceField2);
    }
    //2 static initialization block,
    static {
        staticField=1;
        System.out.println("static initialization block1: "+staticField);
    }
    static {
        staticField=2;
        System.out.println("static initialization block2: "+staticField);
    }

    public Prog2(String instanceField1, String instanceField2){
        this.instanceField1=instanceField1;
        this.instanceField2=instanceField2;
        System.out.println("parameter init method:"+instanceField1+" "+instanceField2);
    }
    public Prog2(){
        System.out.println("no parameter init method");
    }


}
