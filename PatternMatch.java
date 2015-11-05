import java.util.HashMap;
import java.util.Scanner;

public class PatternMatch {
	public boolean wordPattern(String pattern, String str) {
		String p[] = pattern.split("");
		String s[] = str.split(" ");
		if (p.length == s.length) {
			HashMap<String, String> h = new HashMap<String, String>();
			for (int i = 0; i < p.length; i++) {
				if (!h.containsKey(p[i])) {
					h.put(p[i], s[i]);
				} else {
					if (h.get(p[i]).equals(s[i])) {
						continue;
					} else {
						return false;
					}
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		String pattern = sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
		String str = sc2.nextLine();
		PatternMatch pm = new PatternMatch();
		boolean tag = pm.wordPattern(pattern, str);
		if (tag) {
			System.out.println("the string follows the pattern");
		} else {
			System.out.println("the string does not follow the pattern");
		}
	}
}
