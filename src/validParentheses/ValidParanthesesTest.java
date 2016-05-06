package validParentheses;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidParanthesesTest {
	
	private ValidParantheses vp;

	@Before
	public void setUp() throws Exception {
		this.vp = new ValidParantheses();
	}

	@After
	public void tearDown() throws Exception {
		this.vp = null;
	}

	@Test
	public void testExample() {		
		assertTrue(vp.isValid("[](){}"));
	}
	
	@Test
	public void testInvalid(){
		assertTrue(!vp.isValid("[]{{{([[){}{}"));
	}

}
