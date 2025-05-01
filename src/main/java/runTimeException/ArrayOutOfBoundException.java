package runTimeException;

public class ArrayOutOfBoundException {
	public char getCharacter(String str, int index) {
		return str.charAt(index);
	}

	public static void main(String[] args) {

		ArrayOutOfBoundException AB = new ArrayOutOfBoundException();
		System.out.println(AB.getCharacter("Welcome to codemind tech", 50));
	}
}
