package assignment8.prob1;
import java.util.Arrays;

public class MyPersonList {
    private final int INITIAL_LENGTH=4;
    private Person[] currentPersonArray;
    private int size;
    public MyPersonList(){ //Constructor???
        currentPersonArray=new Person[INITIAL_LENGTH];
        size=0;
    }
    public void add(Person p){
        if(p==null) return;
        if(size==currentPersonArray.length) resize();
        currentPersonArray[size++]=p;
    }
    private void resize(){
        System.out.println("Resizing the Person array...");
        int len=currentPersonArray.length;
        int newlen=2*len;
        Person[] newArray=new Person[newlen];
        System.arraycopy(currentPersonArray,0,newArray,0,len);
        currentPersonArray=newArray;
    }
    public boolean find(String lastName){
        if (lastName==null) return false;
        for(Person person: currentPersonArray){
            if(person!=null && person.getLast().equals(lastName))
                return true;
        }
        return false; //the person is not in the list
    }

    public String toString(){
        StringBuilder sb=new StringBuilder("(");
        for(int i=0; i<size-1; ++i){
            sb.append(currentPersonArray[i].toString()+", ");
        }
        sb.append(currentPersonArray[size-1].toString()+")");
        return sb.toString();
    }

    public Object clone(){
        Person[] temp= Arrays.copyOf(currentPersonArray,size);
        return temp;
    }
    public void insert(Person s, int pos){
        if(pos>size || pos<0) return;
        if(pos==currentPersonArray.length || size+1> currentPersonArray.length){
            resize();
        }
        Person[] temp=new Person[currentPersonArray.length+1];
        System.arraycopy(currentPersonArray, 0,temp, 0, pos);
        temp[pos]=s;

        System.arraycopy(currentPersonArray, pos, temp, pos+1, currentPersonArray.length-pos);
        currentPersonArray=temp;
        ++size; //size=size+1; en parameter array size-iin toog aguulj baigaa uchir ene utagiig update xiij bn
    }
    public boolean remove(Person s){
        if(size==0) return false;//list is empty
        if(s==null) return  false;
        int index=-1;

        for(int i=0; i<size; ++i){
            if(currentPersonArray[i].equals(s)){
                index=i;
                break;
            }
        }

        if(index==-1) return false; // s is not found in the list
        Person[] temp=new Person[currentPersonArray.length];
        System.arraycopy(currentPersonArray, 0,temp,0,index);
        System.arraycopy(currentPersonArray,index+1, temp,index,currentPersonArray.length-(index+1));
        currentPersonArray=temp;
        --size; //size=size-1;
        return true;
    }
    public static void main(String[] args) {
        MyPersonList pl=new MyPersonList();
        pl.add(new Person("Buyantugs","Luvsanhuu",40));
        pl.add(new Person("Bold","Tuuuu",30));
        pl.add(new Person("Tsetseg","Bbbb",20));
        pl.add(new Person("Navch","Aaaaa",10));
        pl.add(new Person("Chimeg","Oooo",5));

        Person obj=new Person("Last","First",100);


        System.out.println("The result of find command Bold="+pl.find("Buyantugs"));
        System.out.println(obj.toString());

        System.out.printf(pl.toString());

        System.out.println("Adding a object at person array list...");
        //Insert a person object index #5 at #2 position of Person array
        pl.insert(obj,1);
        //Show the result
        System.out.printf(pl.toString());

        System.out.println("Removing a object from person array list...");
        //Remove a person object index #1 from the list
        pl.remove(obj);
        //Show the result
        System.out.printf(pl.toString());

    }

}
