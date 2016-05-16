package linkedList;

public class LinkedList {
	
	private Node head;
	
	public LinkedList(){
		this.setHead(null);
	}

	public Node insert(Node head, int value){
		Node newNode = new Node(value);
		newNode.setNext(head);
		return newNode;
	}

	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
}
