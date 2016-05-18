package linkedList;

public class Node {

	private int value;
	private Node nextNode;
	
		
	public Node(int value) {
		this.value = value;
	}
	
	public void setNext(Node head){
		this.nextNode = head;
	}
	
	/* GETTERS */
	public int getValue() {
		return value;
	}
	public Node getNextNode() {
		return nextNode;
	}
	
	public boolean hasNext(){
		return nextNode == null;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}	
	
}
