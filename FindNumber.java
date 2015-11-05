import java.util.HashSet;
import java.util.Scanner;

public class FindNumber {

	public int singleNumber(int[] nums) {
		HashSet<Integer> h = new HashSet<Integer>();
		for (int i : nums) {
			if (!h.add(i)) {
				h.remove(i);
			}
		}
		return h.iterator().next();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sint = s.nextLine();
		String[] nums = sint.split(",");
		int array[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			array[i] = Integer.parseInt(nums[i]);
		}
		FindNumber f = new FindNumber();
		int n = f.singleNumber(array);
		System.out.println(n);

	}

}
