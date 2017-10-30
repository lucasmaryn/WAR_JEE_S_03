package pl.coderslab;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {
	public static void main(String[] args) {
//		Pattern compiledPattern = Pattern.compile("^[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]{1,})*\\.([a-zA-Z]{2,}){1}$");
//		Matcher matcher = compiledPattern.matcher("test@test.pl");
//		System.out.println(matcher.find());
//		System.out.println(matcher.matches());
//		boolean result11 = Pattern.matches("[0-9]", "1");
//		System.out.println(result11);
		
		String toReplace1 = "Kurs Euro to 4.12, a dolara to 3.33";
//		String replaced1 = toReplace1.replaceAll("[0-9]", "X");
//		System.out.println(replaced1);
		
		String[] splited = toReplace1.split("[0-9]\\.[0-9]*");
		System.out.println(Arrays.toString(splited));
	}
}
