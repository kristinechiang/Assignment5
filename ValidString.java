import java.util.HashMap;
import java.util.Scanner;

public class ValidString {

	public boolean isValid(String s) {
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("(", ")");
		h.put("{", "}");
		h.put("[", "]");
		String ss[] = s.split("");
		try {
			for (String sym : ss) {
				if (h.containsKey(sym) || h.containsValue(sym)) {
					continue;
				}
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("the string contains other characters");
			return false;
		}		
		if (s.length() % 2 != 0) {
			return false;
		}
		for (int i = 0; i < ss.length; i += 2) {
			if ((h.containsKey(ss[i]))) {
				if (h.get(ss[i]).equals(ss[i + 1])) {
					continue;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ValidString vs = new ValidString();
		boolean tag = vs.isValid(s);
		if (tag) {
			System.out.println("the string is valid");
		} else {
			System.out.println("the string is invalid");
		}
	}
}
