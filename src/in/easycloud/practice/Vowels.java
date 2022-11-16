package in.easycloud.practice;

public class Vowels {
	public static void main(String[] arg) {
		String[] array = { "a", "e", "i", "o", "u" };
		String value = "u";
		switch (indexOf(value, array)) {
		case 0:
			System.out.println("its vowel");
			break;
		case 1:
			System.out.println("its vowel");
			break;
		case 2:
			System.out.println("its vowel");
			break;
		case 3:
			System.out.println("its vowel");
			break;
		case 4:
			System.out.println("its vowel");
			break;
		default:
			System.out.println("its constant");
		}
	}

	private static int indexOf(String value, String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

}
