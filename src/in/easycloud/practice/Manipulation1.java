package in.easycloud.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Manipulation1 {
	public static void main(String[] arg) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entered First String");
		String str = scan.nextLine();
		String res = str.replace(" ", ",");
		ArrayList<String> cars = new ArrayList<String>();
		cars.add(res);
		System.out.println(cars);
	}

}
