package pl.coderslab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
	private static Pattern pattern = Pattern.compile(
			"^[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+" + 
	"(\\.[a-zA-Z0-9-]{1,})*\\.([a-zA-Z]{2,}){1}$");

	public static void main(String[] args) {
		System.out.println(verifyEmail("nicun@wp.pl"));
		
	}

	static boolean verifyEmail(String email) {
		Matcher mt = pattern.matcher(email);
		return mt.find();
	}

}
