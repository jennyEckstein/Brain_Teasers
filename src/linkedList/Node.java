package linkedList;

public class Node {

	private int value;
	private Node nextNode;
	
		
	public Node(int value) {
		this.value = value;
	}
	
	/* GETTERS */
	public int getValue() {
		return value;
	}
	public Node getNextNode() {
		return nextNode;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}	
	
}
