package runTimeException;

public class NumberFormatEx {

	public int convertStringToNum(String numericString) {
		return Integer.parseInt(numericString);
	}
	public static void main(String[]args) {
		

 NumberFormatEx NF= new NumberFormatEx();
	NF.convertStringToNum("10wer");
	}
}
