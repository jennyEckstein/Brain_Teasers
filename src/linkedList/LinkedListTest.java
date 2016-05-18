package linkedList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	
	private LinkedList list;

	@Before
	public void setUp() throws Exception {
		this.list = new LinkedList();
	}

	@After
	public void tearDown() throws Exception {
		this.list = null;
	}

	@Test
	public void testListEmpty() {
		assertTrue(this.list.getHead() == null);
	}
	
	@Test
	public void testInsertEmptyList(){
		
		Node newHead = this.list.insert(1);
		assertTrue(newHead.getValue() == 1);
	}
	
	@Test
	public void testInsertMultipleElements(){
		
		this.list.insert(1);
		this.list.insert(2);
		this.list.insert(3);
		
		Node head = this.list.getHead();
		
		assertTrue(head.getValue() == 3);
		assertTrue(head.getNextNode().getValue() == 2);
		assertTrue(head.getNextNode().getNextNode().getValue() == 1);
		assertTrue(head.getNextNode().getNextNode().getNextNode() == null);
	}
	
	@Test
	public void testDeleteElementFullList(){
		
		this.list.insert(1);
		this.list.insert(2);
		this.list.insert(3);
		
		Node head = this.list.getHead();
		
		this.list.delete(2);
		
		assertTrue(head.getValue() == 3);
		assertTrue(head.getNextNode().getValue() == 1);
		assertNull(head.getNextNode().getNextNode());
	}
	

}
