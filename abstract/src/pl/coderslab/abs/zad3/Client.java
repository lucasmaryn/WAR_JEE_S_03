package pl.coderslab.abs.zad3;

public class Client extends User {

	@Override
	boolean checkLogin(String username, String password) {
		boolean status = false;
		if (super.username.equals(username)) {
			if (super.age >= 18) {
				if (super.password.equals(password)) {
					status = setPassword(password);
				} else {
					System.out.println("Nieprawidlowe haslo");
				}

			} else {
				System.out.println("Jestes za mlody");
			}
		} else {
			System.out.println("Nie ma takiego uzytkownika");
		}

		return status;
	}

	@Override
	public boolean setPassword(String password) {
		if (password.length() >= 8) {
			super.password = password;
			return true;
		}
		return false;
	}

	@Override
	public void setAge(int age) {
		super.age = age;
	}

}
