import static org.junit.Assert.*;

import org.junit.Test;

public class PatternMatchTest {

	@Test
	public void test() {
		PatternMatch pm = new PatternMatch();
		String pattern = "abba";
		String str = "cat dog dog cat";
		boolean result = pm.wordPattern(pattern, str);
		assertEquals(true, result);
		String pattern1 = "abba";
		String str1 = "cat dog cat dog";
		boolean result1 = pm.wordPattern(pattern, str1);
		assertEquals(false, result1);
	}
}
