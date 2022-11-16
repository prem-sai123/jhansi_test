package in.easycloud.practice;

public class Manipulation5 {
	public static void main(String[] arg) {
		String s1 = "jhansirani";
		String s2 = "jhansiranikella";

		int res = isSubstring(s1, s2);
		if (res == -1)
			System.out.println("Not present");
		else
			System.out.println("Present ");
	}

	private static int isSubstring(String s1, String s2) {
		{
			return s2.indexOf(s1);
		}
	}

}
