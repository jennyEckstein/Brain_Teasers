package missingInteger;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MissingIntegerTest {
	
	private MissingInteger missingInteger;

	@Before
	public void setUp() throws Exception {
		this.missingInteger = new MissingInteger();
	}

	@After
	public void tearDown() throws Exception {
		this.missingInteger = null;
	}

	@Test
	public void testExample() {
		int[] array = {1,3,6,4,1,2};
		int result = missingInteger.solution(array);
		
		assertTrue(result == 5);
	}
	
	@Test
	public void textExtremeSingle(){
		int [] array = {3};
		int result = missingInteger.solution(array);
		
		assertTrue(result == 3);
	}
	
	@Test
	public void testEmptyArray(){
		int [] array = {};
		int result = missingInteger.solution(array);
		
		assertTrue(result == 1);
	}

}
