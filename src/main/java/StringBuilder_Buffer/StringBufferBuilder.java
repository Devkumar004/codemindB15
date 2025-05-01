package StringBuilder_Buffer;

public class StringBufferBuilder {

	public static void main(String[] args) {

		StringBuffer st = new StringBuffer("Zest India IT servises");
		System.out.println(st);

		st.append(" Pune");
		System.out.println(st);

		System.out.println(st.hashCode());
	}
}
