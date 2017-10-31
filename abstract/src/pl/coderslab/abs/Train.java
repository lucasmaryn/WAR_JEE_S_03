package pl.coderslab.abs;

public class Train extends Vehicle {
	private int trackWidth;

	public Train(int maxSpeed, String model, int trackWidth) {
		super(maxSpeed, model);
		this.trackWidth = trackWidth;
	}

	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Train(int maxSpeed, String model) {
		super(maxSpeed, model);
	}

	public int getTrackWidth() {
		return trackWidth;
	}

	public void setTrackWidth(int trackWidth) {
		this.trackWidth = trackWidth;
	}

	public void washVehicle(String when) {
		System.out.println("Jedz do myjni po torach o szerokosci " + trackWidth + " " + when);
	}

}
