package collectionFramework;

public class AssignmentWrapper {

	public static void main(String[] args) {
		String s = " Welcome to \n" + " codemind technology \n" + " pune";
		String ss = " ";

		for (int i = 0; i < s.length(); i++) {

			if (Character.isSpace(s.charAt(i))) {
				char c = Character.toUpperCase(s.charAt(i = i + 1));
				ss = ss + " " + c;
				// i = i+1;
				continue;
			}
			ss = ss + s.charAt(i);
		}
		System.out.println(ss);
	}
}
