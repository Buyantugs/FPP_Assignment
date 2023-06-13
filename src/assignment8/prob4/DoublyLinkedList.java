package assignment8.prob4;
public class DoublyLinkedList {
	class Node {
		String value;
		Node next;
		Node previous;
		public String toString() {
			return value == null ? "null" : value;
		}
	}

	Node header;
	int numberOfNodes;
	DoublyLinkedList(){
		header = new Node();
	}
	//adds to the end of the list
	public void addLast(String item){
		//implement
		Node newNode = new Node();
		newNode.value = item;
		Node temp = header;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.previous = temp;
	}
	public boolean remove(String item){

		Node temp = header;
		while (temp != null){
			if (temp.value == item){
				temp.previous.next =  temp.next;
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}
	private void toString(StringBuilder sb, Node n) {
		if(n==null) return;
		if(n.value != null) sb.append(" " + n.value);
		toString(sb, n.next);
	}
	public static void main(String[] args){
		DoublyLinkedList list = new DoublyLinkedList();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		list.addLast("Buyan");
		list.addLast("Tugs");
		System.out.println(list.toString());

		//delete a object from DoubleLinked list;
		list.remove("Steve");
		System.out.println(list.toString());

	}
}
