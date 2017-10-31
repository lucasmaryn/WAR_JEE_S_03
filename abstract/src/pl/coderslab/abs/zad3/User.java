package pl.coderslab.abs.zad3;

public abstract class User {
	protected String username;
	protected String password;
	protected int age;
	private boolean logged = false;
	private int loginCount = 0;

	abstract boolean checkLogin(String username, String password);

	public void setUsername(String login) {
		username = login;
	}

	public final boolean login(String username, String password) {
		if (loginCount <= 3) {
			logged = checkLogin(username, password);
		}else {
			System.out.println("Probowales trzykrotnie sie zalogowac. Nie masz wiecej prob");
			return false;
		}

		if (logged) {
			loginCount = 0;
		} else {
			loginCount++;
			
			System.out.println("Bledne logowanie. Pozostaly ci " + (3 - loginCount) + " proby");
		}

		return logged;
	}

	public abstract boolean setPassword(String password);

	public abstract void setAge(int age);

	public String getUsername() {
		return username;
	}

	public int getAge() {
		return age;
	}

	public boolean isLogged() {
		return logged;
	}
}
