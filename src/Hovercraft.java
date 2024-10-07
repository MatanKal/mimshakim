public class Hovercraft implements SeaVessel, LandVehicle {
	private int passengers;
	private String name;
	private int speed;
	private int numOfWheels;

	public Hovercraft(int passengers, String name, int speed, int numOfWheels)
	{
		this.passengers=passengers;
		this.name=name;
		this.speed=speed;
		this.numOfWheels=numOfWheels;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
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

	public int getNumOfWheels() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void drive() {
		System.out.println("driving");

	}

	public void launch() {
		System.out.println("launching");

	}
	public void getDetails(){
		System.out.println("name:" + this.name + " max pass: "+this.passengers+" max speed: "+this.speed +" num of wheels:"+this.numOfWheels);
	}

}
