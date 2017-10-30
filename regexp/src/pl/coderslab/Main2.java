package pl.coderslab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

	static Pattern passwordPattern = Pattern
			.compile("(?=[\\S]{10,15})(?=.*[A-Z]+.*)(?=.*[a-z]+.*)(?!.*[a-z]{2,}.*)(?!.*[A-Z]{2,}.*)");

	public static void main(String[] args) {
		System.out.println(verifyPassword("aBcDeFgHiJ"));
	}

	static boolean verifyPassword(String password) {
		Matcher passMatcher = passwordPattern.matcher(password);
		return passMatcher.find();
	}
}
