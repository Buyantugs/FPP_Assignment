package assignment9;

import java.util.Arrays;

public class ArrayQueueImp {
    private int[] arr = new int[3];
    private int front = -1;
    private int rear = 0;
    public int peek() {

        if(!isEmpty()) return arr[front];
        else return -1;
        //implement
    }
    public void enqueue(int obj){
        if(isEmpty()){
            front=0;
            arr[front]=obj;
        } else if(rear<arr.length-1) {
            arr[rear + 1] = obj;
            rear++;
        }
        else {
            resize();
            arr[rear+1]=obj;
            rear++;
        }
        //implement
    }
    public int dequeue() {

        if(isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        } else{
            int[] tmpArr=new int[rear];
            for (int i=1; i<rear+1; i++){
                tmpArr[i-1]=arr[i];
            }
            arr=tmpArr;
            rear--;
            if(rear==-1){front=-1; rear=0;}
        }
        return rear;
    }
    public boolean isEmpty(){
        //implement
        return (front==-1);
    }
    public int size(){
        return rear;
    }
    private void resize(){
        int i = arr.length * 2;
        int[] newArr=new int[i];
        newArr=Arrays.copyOf(arr,i);
        arr=newArr;
        System.out.println("Resizing the array queue!");
    }

    public void toPrint(){
        if(front==-1){
            System.out.println("Queue array is empty: ");
        } else {
            System.out.println("\nPrinting the array queue: ");
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + ",");
            }
        }
    }

    public static void main(String[] args) {

        ArrayQueueImp aq=new ArrayQueueImp();
        System.out.println("Queue array is empty: "+aq.isEmpty());
        aq.enqueue(100);
        aq.enqueue(200);
        aq.enqueue(300);
        aq.enqueue(400);
        System.out.println("The peek value of Array queue: "+aq.peek());
        System.out.println("The size of Array Queue: "+aq.size());
        aq.toPrint();
        aq.dequeue();
        aq.dequeue();
        aq.dequeue();
        aq.dequeue();
        aq.dequeue();
        aq.toPrint();
    }
}
