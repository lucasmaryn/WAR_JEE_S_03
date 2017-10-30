package pl.coderslab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Main3 {
	static Pattern pattern = Pattern.compile("[0-9]+([-*\\+][0-9]+)+");

	public static void main(String[] args) throws IOException {
		String[] tasks = { "1+28*2", "3+9+1", "12/4+10*3", "quit", "12/4+10*3" };
		StringBuilder sb = new StringBuilder();
		for (String task : tasks) {
			if (!"quit".equals(task)) {
				sb.append(task).append("=").append(compute(task)).append(System.lineSeparator());
			} else {
				break;
			}
		}
		System.out.println(sb.toString());
		byte data[] = sb.toString().getBytes();
		Path file = Paths.get("result.txt");
		Files.write(file, data);
	}

	public static int compute(String txt) {
		Matcher m = pattern.matcher(txt);
		double result = 0;
		if (m.find()) {
			Expression e = new ExpressionBuilder(txt).build();
			result = e.evaluate();
		}
		return (int) result;
	}

}
