package permCheck;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PermCheckTest {
	
	private PermCheck permCheck;

	@Before
	public void setUp() throws Exception {
		this.permCheck = new PermCheck();
	}

	@After
	public void tearDown() throws Exception {
		this.permCheck = null;
	}

	@Test
	public void testExamplePerm() {
		int [] array = {4,1,3,2};			
		int result = permCheck.solution(array);
		assertTrue(result == 1);
	}
	
	@Test
	public void testExampleNonPerm(){
		int [] array = {4,1,3};	
		int result = permCheck.solution(array);
		assertTrue(result == 0);
	}
	
	@Test
	public void singleElementArrayPerm(){
		int [] array = {1};
		int result = permCheck.solution(array);
		assertTrue(result == 1);
	}
	
	@Test
	public void singleElementArrayNonPerm(){
		int [] array = {2};
		int result = permCheck.solution(array);
		assertTrue(result == 0);
	}

}
