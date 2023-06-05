package day4;
//Write a Singleton class that will only have 3 instances.
public class Prog1 {
    private static Prog1 instance1=null;
    private static Prog1 instance2=null;
    private static Prog1 instance3=null;
    private Prog1(){
    }
    public static Prog1 getInstance1(){
        if(instance1==null){
            instance1=new Prog1();
        }
        return instance1;
    }
    public static Prog1 getInstance2(){
        if(instance2==null){
            instance2=new Prog1();
        }
        return instance2;
    }

    public static Prog1 getInstance3(){
        if(instance3==null){
            instance3=new Prog1();
        }
        return instance3;
    }

}
