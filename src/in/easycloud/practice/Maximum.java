package in.easycloud.practice;

public class Maximum {

	public static void main(String[] arg) {
		int numOne = 4;
		int numTwo = 5;
		switch (numOne > numTwo ? 0 : 1) {
		case 0:
			System.out.println("This no is greater than" + numOne);

			break;
		case 1:
			System.out.println("" + numTwo);
			break;
		}

	}
}
