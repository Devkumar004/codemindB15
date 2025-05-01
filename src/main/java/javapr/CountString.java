package javapr;

public class CountString {
 
	public static void main(String[] args) {

		String S = "Welcome to coDemind";
		S = S.replaceAll("W", "@");
		int count = 1;
		String SS = " ";
 		 S = S.replace('o', '$');
		
		for (int i = 0; i < S.length(); i++) {

			if (!(SS.contains(String.valueOf(S.charAt(i))))) {

				for (int j = i + 1; j < S.length(); j++) {

					if (S.charAt(i) == S.charAt(j)) {
						count++;
					}
				}
				System.out.println(S.charAt(i)+"  = "+count);
			SS=SS+S.charAt(i);
			count=1;
			}
		}
		System.out.println(S);

	}
}
