package day4;
public class Counter {
    static int count;
    Counter(){
        count++;
    }
    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
        Counter instance=null;
        for(int i=0; i<10; i++){
            instance=new Counter();
        }
        System.out.println("Counter:"+instance.getCount());
    }

}
