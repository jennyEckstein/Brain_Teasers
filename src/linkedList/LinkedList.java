package linkedList;

public class LinkedList {
	
	private Node head;
	
	public LinkedList(){
		this.setHead(null);
	}

	public Node insert(int value){
		Node newNode = new Node(value);
		newNode.setNext(this.head);		
		this.head = newNode;
		return head;
	}
	
	public Node find(Node head, int value){
		
		if (head == null){
			return null;
		}
		Node currentElement  = head;
		
		while(currentElement.hasNext() && currentElement.getValue() != value){
			currentElement.getNextNode();
		}
		return currentElement;
	}
	

	public boolean delete(int value){
		
		if(head == null){
			return false;
		}
		
		Node currentElement = head;
		while(currentElement.hasNext()){
			Node nextNode = currentElement.getNextNode();
			
			if (nextNode.getValue() == value){
				currentElement.setNext(nextNode.getNextNode());
				
				return true;
			}
		}
		return false;
	}
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
}
