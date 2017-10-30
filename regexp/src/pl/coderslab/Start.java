package pl.coderslab;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start {
	
	static Pattern compiledPattern = Pattern.compile("Wyrażenia reg.*");
	
	public static void main(String[] args) {
//		Pattern compiledPattern = Pattern.compile("Wyrażenia reg.*");
		Matcher matcher = compiledPattern.matcher("Wyrażenia regularne w Javie");
		System.out.println(matcher.find());
		System.out.println(matcher.matches());
		boolean result11 = Pattern.matches("[0-9]", "1");
		
		String text1 = "1123";
		System.out.println(text1.matches("\\d+"));
		String text2 = "abc";
		System.out.println(text2.matches("\\D+"));
		
		String toReplace1 = "Kurs Euro to 4.12, a dolara to 3.33";
		String replaced1 = toReplace1.replaceAll("[0-9]", "X");
		System.out.println(replaced1);
		
		String[] splited = toReplace1.split("[0-9]\\.[0-9]*");
		System.out.println(Arrays.toString(splited));
		
	}

}
