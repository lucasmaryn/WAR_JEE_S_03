package pl.coderslab.abs;

public abstract class Vehicle {
	private int maxSpeed;
	private String model;

	public Vehicle(int maxSpeed, String model) {
		super();
		this.maxSpeed = maxSpeed;
		this.model = model;
	}

	public Vehicle() {
	}

	public void getInfo(String when) {
//		if(this.getClass().getName() == "Car") {
//			System.out.println("jedz do myjni " + when);
//		}else if(this.getClass().getName() == "Train") {
//			System.out.println("Jedz do myjni po torach o szerokosci " + trackWidth + " " + when);
//		}
		washVehicle(when);
	}

	protected abstract void washVehicle(String when);

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String toString() {
		return "Class : " + this.getClass().getName() + ", model: " + model + ", speed: " + maxSpeed;
	}

}
