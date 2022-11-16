package in.easycloud.practice;

public class Loops3 {
	public static void main(String[] arg) {
		{
			int n1 = 0, n2 = 1, n3, i, count = 8;
			for (i = 2; i < count; ++i) {
				n3 = n1 + n2;
				System.out.print(" " + n3);
				n1 = n2;
				n2 = n3;
			}
		}

	}
}
