import static org.junit.Assert.*;

import org.junit.Test;

public class ValidStringTest {

	@Test
	public void test() {
		ValidString vs=new ValidString();
		boolean result1=vs.isValid("()[]{}");
		assertEquals(true,result1);
		boolean result2=vs.isValid("([)]{}");
		assertEquals(false,result2);
		boolean result3=vs.isValid("()22");
		assertEquals(false,result3);
	}

}
