package in.easycloud.practice;

import java.util.Scanner;

public class Manipulation2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entered First String");
		String str1 = scan.nextLine();
		char[] charArray = str1.toCharArray();
		String result = "";

		for (int i = 0; i < charArray.length; i++) {

			if (!Character.isDigit(charArray[i])) {
				result = result + charArray[i];
			}
		}

		System.out.println(result);
	}

}
