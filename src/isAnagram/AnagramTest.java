package isAnagram;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnagramTest {
	
	private Anagram anagram;

	@Before
	public void setUp() throws Exception {
		this.anagram = new Anagram();
	}

	@After
	public void tearDown() throws Exception {
		this.anagram = null;
	}

	@Test
	public void testExample() {
		
		boolean result = anagram.isAnagram("twelve plus one", "eleven plus two");
		assertTrue(result);
	}
	
	@Test
	public void testNonAnagram(){
		boolean result = anagram.isAnagram("weord", "wrdof");
		assertTrue(!result);
	}
	
	@Test
	public void testEmptyInput(){
		boolean result = anagram.isAnagram(null, null);
		assertTrue(!result);
	}
	
	@Test
	public void testNonEqualInput(){
		boolean result = anagram.isAnagram("abcde", "cd");
		assertTrue(!result);
	}

}
