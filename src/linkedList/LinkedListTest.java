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
		
		Node newHead = this.list.insert(1);
		Node newHead1 = this.list.insert(2);
		Node newHead2 = this.list.insert(3);
		
		assertTrue(newHead2.getValue() == 3);
		assertTrue(newHead2.getNextNode().getValue() == 2);
		assertTrue(newHead2.getNextNode().getNextNode().getValue() == 1);
		assertTrue(newHead2.getNextNode().getNextNode().getNextNode() == null);
	}
	
	

}
