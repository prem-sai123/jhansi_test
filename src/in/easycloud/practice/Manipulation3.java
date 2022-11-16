package in.easycloud.practice;

import java.util.Scanner;

public class Manipulation3 {
	public static void main (String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Entered First String");
		String str1=scan.nextLine();
		Scanner scan1=new Scanner(System.in);
		System.out.println("Entered Second String");		
		String str2=scan1.nextLine();
		int str3=str1.length()-str2.length();
		System.out.println(str3);
		
	}

}
