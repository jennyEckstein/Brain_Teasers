package frogRiverOne;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FrogRiverOneTest {
	
	private FrogRiverOne frogRiverOne;

	@Before
	public void setUp() throws Exception {
		this.frogRiverOne = new FrogRiverOne();
	}

	@After
	public void tearDown() throws Exception {
		this.frogRiverOne = null;
	}

	@Test
	public void testExample() {
		int[] array = {1,3,1,4,2,3,5,4};
		int distance = 5;

		int result = frogRiverOne.solution(distance, array);
		assertTrue(result == 6);
	}
	
	@Test
	public void testEmptyArray(){
		int[] array = {};
		int distance = 5;

		int result = frogRiverOne.solution(distance, array);
		assertTrue(result == -1);
	}
	
	@Test
	public void testOneElementArray(){
		int[] array = {3};
		int distance = 3;

		int result = frogRiverOne.solution(distance, array);
		assertTrue(result == 0);
	}

}
