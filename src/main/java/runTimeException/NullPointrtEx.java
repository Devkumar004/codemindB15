package runTimeException;

public class NullPointrtEx {

	public void stringLength(String str) {
		System.out.println("Length of sting = " + str.length());
	}

	public static void main(String[] args) {
		NullPointrtEx NP = new NullPointrtEx();
		NP.stringLength(null);
	}
}
