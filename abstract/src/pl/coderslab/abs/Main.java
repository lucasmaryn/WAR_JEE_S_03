package pl.coderslab.abs;

public class Main {

	public static void main(String[] args) {
		Vehicle[] vehicles = { new Car(200, "Syrena 105", "Sport"), new Train(250, "Pendolino", 600) };

		for (Vehicle v : vehicles) {
			System.out.println(v.toString());
			v.getInfo("dzis");
		}
	}

}
