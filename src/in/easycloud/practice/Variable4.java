package in.easycloud.practice;

public class Variable4 {

	public static void main(String[] args) {
		String value = "nana";
		int strleng = value.length();
		String strReverse = "";
		char[] chString = value.toCharArray();
		for (int a = strleng - 1; a >= 0; a--) {
			strReverse = strReverse + chString[a];
		}
		System.out.println("Given string: " + value);
		System.out.println("Reverse String: " + strReverse);
		if (value.equals(strReverse)) {
			System.out.println("string is palindrome.");
		} else {
			System.out.println("string is not palindrome.");
		}
	}
}
