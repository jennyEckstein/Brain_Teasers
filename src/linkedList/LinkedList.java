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
	
	public Node find(Node head, int value){
		
		if (head == null){
			return null;
		}
		Node currentElement  = head;
		
		while(currentElement.getNextNode() != null && currentElement.getValue() != value){
			currentElement.getNextNode();
		}
		return currentElement;
	}

	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
}
