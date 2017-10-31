package pl.coderslab.abs.zad3;

public class App {

	public static void main(String[] args) {
		User admin = new Admin("127.0.0.1");
		if (admin.setPassword("haslo12345")) {
			admin.setAge(20);
			admin.setUsername("admin");
		}

		admin.login("admin", "haslo123");
		System.out.println("Pierwsza proba logowania: " + admin.isLogged());

		admin.login("admin", "haslo123");
		System.out.println("Druga proba logowania: " + admin.isLogged());

		admin.login("admin", "haslo12345");
		System.out.println("Trzecia proba logowania: " + admin.isLogged());

		admin.login("admin", "haslo123");
		System.out.println("Czwarta proba logowania: " + admin.isLogged());

		admin.login("admin", "haslo12345");
		System.out.println("Piata proba logowania: " + admin.isLogged());

		System.out.println("-----------------------------------");

		admin = new Client();
		if (admin.setPassword("12345haslo")) {
			admin.setUsername("user");
		}

		admin.setAge(10);
		admin.login("user", "12345haslo");
		System.out.println("Pierwsza proba logowania: " + admin.isLogged());
		admin.setAge(20);

		admin.login("user", "12345hasl");
		System.out.println("Druga proba logowania: " + admin.isLogged());

		admin.login("user", "12345haslo");
		System.out.println("Czwarta proba logowania: " + admin.isLogged());

		admin.login("user", "12345hasl");
		System.out.println("Piata proba logowania: " + admin.isLogged());
		
		admin.login("user", "12345haslo");
		System.out.println("Szosta proba logowania: " + admin.isLogged());
	}

}
