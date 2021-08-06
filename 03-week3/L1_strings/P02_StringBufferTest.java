package cs520.module3.L1_strings;

public class P02_StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.printf("Length = %d\n", sb.length());

		sb.append("abc");
		sb.append("123");

		System.out.printf("Length = %d, String:%s\n", sb.length(), sb.toString());

		sb.insert(3, "DEF");
		System.out.printf("Length = %d, String:%s\n", sb.length(), sb.toString());

		sb.delete(3, 5);
		System.out.printf("Length = %d, String:%s\n", sb.length(), sb.toString());

		sb.reverse();
		System.out.printf("Length = %d, String:%s\n", sb.length(), sb.toString());

		String withoutFirstAndLast = sb.substring(1, sb.length() - 1);
		System.out.printf("Without First and Last:%s\n", withoutFirstAndLast);

		StringBuffer cascadingSb = new StringBuffer();

		cascadingSb.append("abc").append("123").insert(3, "DEF");
		System.out.printf("Length = %d, String:%s\n", cascadingSb.length(), 
			cascadingSb.toString());
	}
}
