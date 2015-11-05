import static org.junit.Assert.*;

import org.junit.Test;

public class FindNumberTest {

	@Test
	public void test() {
		FindNumber f = new FindNumber();
		int nums[] = { 1, 3, 2, 3, 2 };
		int result = f.singleNumber(nums);
		assertEquals(1, result);
	}

}
