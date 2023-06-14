package assignment9;
public class DoubleLinkedListStack {
    class StackNode{
        Object obj;
        StackNode next;
        StackNode prev;
        StackNode(Object x){obj=x;}
    }

    int numberOfNodes;
    StackNode head, tail;
    public DoubleLinkedListStack(){
        numberOfNodes=0;
        head=new StackNode(0);
        tail=new StackNode(0);
        head.next=tail;
        tail.prev=head;
    }
    public void push(Object obj){

        StackNode pred=head;
        StackNode succ=head.next;
        ++numberOfNodes;

        StackNode newNode=new StackNode(obj);
        newNode.prev=pred;
        newNode.next=succ;
        succ.prev=newNode;
        pred.next=newNode;
     }

     public void pop(){

         StackNode pred=head;
         StackNode succ=head.next.next;
         pred.next=succ;
         succ.prev=pred;
         --numberOfNodes;
     }
     public Object peek(){
        return head.obj;
     }
     public int size(){
        return numberOfNodes;
     }
     public boolean isEmpty(){
        return (numberOfNodes==0);
     }

     public void toPrint(){
        StackNode curr=head;
        while (curr.next!=null){
            System.out.print(curr.obj.toString());
            curr=curr.next;
        }
         System.out.println("\n");
     }

    public static void main(String[] args) {
        DoubleLinkedListStack lls=new DoubleLinkedListStack();

        lls.push('K');
        lls.push('L');
        lls.push('M');
        lls.push('N');
        lls.toPrint(); // print stack objects
        lls.pop(); //remove top object from stack
        lls.toPrint(); // print stack objects
    }

}
