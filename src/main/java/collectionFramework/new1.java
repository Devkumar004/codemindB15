package collectionFramework;

public class new1 {

	public static void main(String[] args) {
		String s = " welcome to codemind" + " technology pune" + " maharashtra india";
		String ss = "";

		for (int i = 0; i < s.length(); i++) {

			if (Character.isSpace(s.charAt(i))) {
				char ccc = Character.toUpperCase(s.charAt(i + 1));
				ss = ss + " " + ccc;
				i +=1;
				continue;

			}
			ss = ss + s.charAt(i);
		}

		System.out.println(ss);
	}
}
