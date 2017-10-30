package pl.coderslab;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App {
	
	static Logger LOGGER = Logger.getLogger(App.class);

	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		LOGGER.error("--------------------> abc");
//		try {
//			int i = 1/0;
//		}catch(Exception e) {
//			LOGGER.error("Cos tu sie stalo", e);
////			System.out.println(e.toString());
//		}
		Connection connect = Jsoup.connect("http://www.onet.pl/");
		try {
		    Document document = connect.get();
		    Elements links = document.select("span.title");
		    for (Element elem : links) {
		        System.out.println(elem.text());
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}
