package pl.coderslab.abs;

public class Car extends Vehicle {
	String type;

	public Car(int maxSpeed, String model, String type) {
		super(maxSpeed, model);
		this.type = type;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int maxSpeed, String model) {
		super(maxSpeed, model);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public void washVehicle(String when) {
		System.out.println("jedz do myjni " + when);
	}
	
	
}
