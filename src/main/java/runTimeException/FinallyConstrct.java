package runTimeException;

public class FinallyConstrct {
	
	public char getCharacterFromSpecifiedIndex(String s, int index) {
		try {
		char c= s.charAt(index);
		}
		catch (NullPointerException | ArithmeticException e) {
		}
		
		finally {
		}
		return 0;
		}
	/*		return c;
		
	}
*/
	public static void main(String[] args) {
		FinallyConstrct F= new FinallyConstrct();
		F.getCharacterFromSpecifiedIndex("welcome", 10);
		System.out.println("character= ");
		
	}
}
