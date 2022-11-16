package in.easycloud.practice;

public class Even {

	public static void main(String[] arg) {

		int num = 15;
		switch ((num % 2 == 0) ? 0 : 1) {
		case 0:
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");
			break;
		}
	}
}
