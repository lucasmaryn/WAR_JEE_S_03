package pl.coderslab.abs.zad3;

public class Admin extends User {

	private String ip;

	public Admin(String ip) {
		this.ip = ip;
	}

	boolean checkLogin(String username, String password) {
		boolean status = false;
		if (super.username.equals(username)
				&& ip.indexOf("127") == 0 || ip.indexOf("192") == 0) {
			status = setPassword(password);
		}
		return status;
	}

	public boolean setPassword(String password) {
		if (password.length() >= 10) {
			super.password = password;
			return true;
		}
		return false;
	}

	public void setAge(int age) {
		super.age = age;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}

}
