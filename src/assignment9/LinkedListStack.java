package assignment9;

public class LinkedListStack {
    class LikedStackNode{
        private Object obj;
        LikedStackNode next;
        LikedStackNode(Object o){obj=o;}
    }

    int sizeOfStack;
    LikedStackNode head;

    public LinkedListStack(){
        sizeOfStack=0;
        head=new LikedStackNode(0);
    }

    public void push(Object obj){
        ++sizeOfStack;
        LikedStackNode pred=head;
        LikedStackNode toAdd=new LikedStackNode(obj);
        toAdd.next=pred.next;
        pred.next=toAdd;
        System.out.println(toAdd.obj.toString()+ ": object added into Stack");
    }

    public Object pop(){

        if(sizeOfStack==0){
            System.out.printf("Stack is empty");
            return null;
        } else {
            --sizeOfStack;
            LikedStackNode pred = head;
            pred = head.next;
            head.next = head.next.next;
            pred.next = null;
            System.out.println(pred.obj.toString()+": object removed from stack!");
            return pred;
        }
    }

    public Object peak(){
        return head.next.obj;
    }

    public boolean isEmpty(){
        return (sizeOfStack==0);
    }

    public int size(){
        return sizeOfStack;
    }

    public void printStackData(){

        LikedStackNode lsn=head;
        System.out.println("Printing stack data: ");
        while(lsn.next!=null){
            System.out.println(lsn.obj.toString());
            lsn=lsn.next;
        }
        System.out.println(lsn.obj.toString());
    }
    public static void main(String[] args) {
        LinkedListStack lls=new LinkedListStack();
        lls.push('A');
        lls.push('B');
        lls.push('C');
        Object ob=lls.peak();
        System.out.println(String.valueOf(ob));
        lls.printStackData();
        System.out.println("The size of stack: "+lls.size());
        Object o=lls.pop();
        o=lls.pop();
        o=lls.pop();
        o=lls.pop();

        lls.printStackData();

    }
}
