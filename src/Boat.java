import com.sun.jdi.PrimitiveValue;

public class Boat implements SeaVessel {
	private String name;
	private int passengers;
	private int speed;
	public Boat(int passengers,String name, int speed)
	{
		this.name = name;
		this.passengers = passengers;
		this.speed =  speed;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMaxPassengers() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void launch() {
		System.out.println("launching");

	}
	public void getDetails() {
		System.out.println("name:" + this.name + "max pass: " + this.passengers + "max speed: " + this.speed);
	}

}
